package TpNote.tp5.model;

import java.util.Date;
import java.util.HashMap;


public class Meteo {

    private City city;
    private Date update;
    private Forecast forecast;


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public HashMap<Integer, String> getHashWeather(HashMap<Integer, String> hm) {
        hm.put(0, "Soleil");
        hm.put(1, "Peu nuageux");
        hm.put(2, "Ciel voilé");
        hm.put(3, "Nuageux");
        hm.put(4, "Très nuageux");
        hm.put(5, "Couvert");
        hm.put(6, "Brouillard");
        hm.put(7, "Brouillard givrant");
        hm.put(10, "Pluie faible");
        hm.put(11, "Pluie modérée");
        hm.put(12, "Pluie forte");
        hm.put(13, "Pluie faible verglaçante");
        hm.put(14, "Pluie modérée verglaçante");
        hm.put(15, "Pluie forte verglaçante");
        hm.put(16, "Bruine");
        hm.put(20, "Neige faible");
        hm.put(21, "Neige modérée");
        hm.put(22, "Neige forte");
        hm.put(30, "Pluie et neige mêlées faibles");
        hm.put(31, "Pluie et neige mêlées modérées");
        hm.put(32, "Pluie et neige mêlées fortes");
        hm.put(40, "Averses de pluie locales et faibles");
        hm.put(41, "Averses de pluie locales");
        hm.put(42, "Averses locales et fortes");
        hm.put(43, "Averses de pluie faibles");
        hm.put(44, "Averses de pluie");
        hm.put(45, "Averses de pluie fortes");
        hm.put(46, "Averses de pluie faibles et fréquentes");
        hm.put(47, "Averses de pluie fréquentes");
        hm.put(48, "Averses de pluie fortes et fréquentes");
        hm.put(60, "Averses de neige localisées et faibles");
        hm.put(61, "Averses de neige localisées");
        hm.put(62, "Averses de neige localisées et fortes");
        hm.put(63, "Averses de neige faibles");
        hm.put(64, "Averses de neige");
        hm.put(65, "Averses de neige fortes");
        hm.put(66, "Averses de neige faibles et fréquentes");
        hm.put(67, "Averses de neige fréquentes");
        hm.put(68, "Averses de neige fortes et fréquentes");
        hm.put(70, "Averses de pluie et neige mêlées localisées et faibles");
        hm.put(71, "Averses de pluie et neige mêlées localisées");
        hm.put(72, "Averses de pluie et neige mêlées localisées et fortes");
        hm.put(73, "Averses de pluie et neige mêlées faibles");
        hm.put(74, "Averses de pluie et neige mêlées");
        hm.put(75, "Averses de pluie et neige mêlées fortes");
        hm.put(76, "Averses de pluie et neige mêlées faibles et nombreuses");
        hm.put(77, "Averses de pluie et neige mêlées fréquentes");
        hm.put(78, "Averses de pluie et neige mêlées fortes et fréquentes");
        hm.put(100, "Orages faibles et locaux");
        hm.put(101, "Orages locaux");
        hm.put(102, "Orages fort et locaux");
        hm.put(103, "Orages faibles");
        hm.put(104, "Orages");
        hm.put(105, "Orages forts");
        hm.put(106, "Orages faibles et fréquents");
        hm.put(107, "Orages fréquents");
        hm.put(108, "Orages forts et fréquents");
        hm.put(120, "Orages faibles et locaux de neige ou grésil");
        hm.put(121, "Orages locaux de neige ou grésil");
        hm.put(122, "Orages locaux de neige ou grésil");
        hm.put(123, "Orages faibles de neige ou grésil");
        hm.put(124, "Orages de neige ou grésil");
        hm.put(125, "Orages de neige ou grésil");
        hm.put(126, "Orages faibles et fréquents de neige ou grésil");
        hm.put(127, "Orages fréquents de neige ou grésil");
        hm.put(128, "Orages fréquents de neige ou grésil");
        hm.put(130, "Orages faibles et locaux de pluie et neige mêlées ou grésil");
        hm.put(131, "Orages locaux de pluie et neige mêlées ou grésil");
        hm.put(132, "Orages fort et locaux de pluie et neige mêlées ou grésil");
        hm.put(133, "Orages faibles de pluie et neige mêlées ou grésil");
        hm.put(134, "Orages de pluie et neige mêlées ou grésil");
        hm.put(135, "Orages forts de pluie et neige mêlées ou grésil");
        hm.put(136, "Orages faibles et fréquents de pluie et neige mêlées ou grésil");
        hm.put(137, "Orages fréquents de pluie et neige mêlées ou grésil");
        hm.put(138, "Orages forts et fréquents de pluie et neige mêlées ou grésil");
        hm.put(140, "Pluies orageuses");
        hm.put(141, "Pluie et neige mêlées à caractère orageux");
        hm.put(142, "Neige à caractère orageux");
        hm.put(210, "Pluie faible intermittente");
        hm.put(211, "Pluie modérée intermittente");
        hm.put(212, "Pluie forte intermittente");
        hm.put(220, "Neige faible intermittente");
        hm.put(221, "Neige modérée intermittente");
        hm.put(222, "Neige forte intermittente");
        hm.put(230, "Pluie et neige mêlées");
        hm.put(231, "Pluie et neige mêlées");
        hm.put(232, "Pluie et neige mêlées");
        hm.put(235, "Averses de grêle");
        return hm;
    }
}

class City {
    private String insee;
    private int cp;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;

    public String getInsee() {
        return insee;
    }

    public void setInsee(String insee) {
        this.insee = insee;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}

class Forecast {
    private String insee;
    private int cp;
    private double latitude;
    private double longitude;
    private int day;
    private Date datetime;
    private int wind10m;
    private int gust10m;
    private int dirwind10m;
    private double rr10;
    private double rr1;
    private int probarain;
    private int weather;
    private int tmin;
    private int tmax;
    private int sun_hours;
    private int etp;
    private int probafrost;
    private int probafog;
    private int probawind70;
    private int probawind100;
    private int gustx;

    public String getInsee() {
        return insee;
    }

    public void setInsee(String insee) {
        this.insee = insee;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getWind10m() {
        return wind10m;
    }

    public void setWind10m(int wind10m) {
        this.wind10m = wind10m;
    }

    public int getGust10m() {
        return gust10m;
    }

    public void setGust10m(int gust10m) {
        this.gust10m = gust10m;
    }

    public int getDirwind10m() {
        return dirwind10m;
    }

    public void setDirwind10m(int dirwind10m) {
        this.dirwind10m = dirwind10m;
    }

    public double getRr10() {
        return rr10;
    }

    public void setRr10(double rr10) {
        this.rr10 = rr10;
    }

    public double getRr1() {
        return rr1;
    }

    public void setRr1(double rr1) {
        this.rr1 = rr1;
    }

    public int getProbarain() {
        return probarain;
    }

    public void setProbarain(int probarain) {
        this.probarain = probarain;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getTmin() {
        return tmin;
    }

    public void setTmin(int tmin) {
        this.tmin = tmin;
    }

    public int getTmax() {
        return tmax;
    }

    public void setTmax(int tmax) {
        this.tmax = tmax;
    }

    public int getSun_hours() {
        return sun_hours;
    }

    public void setSun_hours(int sun_hours) {
        this.sun_hours = sun_hours;
    }

    public int getEtp() {
        return etp;
    }

    public void setEtp(int etp) {
        this.etp = etp;
    }

    public int getProbafrost() {
        return probafrost;
    }

    public void setProbafrost(int probafrost) {
        this.probafrost = probafrost;
    }

    public int getProbafog() {
        return probafog;
    }

    public void setProbafog(int probafog) {
        this.probafog = probafog;
    }

    public int getProbawind70() {
        return probawind70;
    }

    public void setProbawind70(int probawind70) {
        this.probawind70 = probawind70;
    }

    public int getProbawind100() {
        return probawind100;
    }

    public void setProbawind100(int probawind100) {
        this.probawind100 = probawind100;
    }

    public int getGustx() {
        return gustx;
    }

    public void setGustx(int gustx) {
        this.gustx = gustx;
    }
}


