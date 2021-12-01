package TpNote.tp5.controller;

import TpNote.tp5.model.AddressRepository;
import TpNote.tp5.model.Coordinates;
import TpNote.tp5.model.Meteo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Controller
public class AddressController {
    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/adresses")
    public String showAddresses(Model model) {
        model.addAttribute("allAdresses", addressRepository.findAll());
        return "addresses";
    }

    @GetMapping("/adresse")
    public String addAddresse() {
        return "addAddress";
    }

    @GetMapping("/meteo")
    public String meteo() {
        return "meteo";
    }

    @PostMapping("/meteo")
    public String formMeteo(@ModelAttribute(name = "address") String address, Model model) {

        RestTemplate restTemplate = new RestTemplate();
        Coordinates coo = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q={adresse}&limit=1", Coordinates.class, address);

        Meteo meteo = restTemplate.getForObject("https://api.meteo-concept.com/api/forecast/daily/0?token=3d242d2e910a80f96667425c19bb88916cd307002825695c63669327ec3cbd64&latlng={x},{y}", Meteo.class, coo.getFeatures().get(0).getGeometry().getCoordinates().get(1), coo.getFeatures().get(0).getGeometry().getCoordinates().get(0));
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm = meteo.getHashWeather(hm);
        model.addAttribute("meteo", meteo);
        model.addAttribute("weatherHash", hm);
        return "meteo";
    }
}