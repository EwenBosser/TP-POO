Étape 13 -
1 - Dans le controlleur avec @GetMapping("/greeting")
2 - return "greeting";
3 - model.addAttribute("nomTemplate", nameGET);

Étape 17 - 
Cela créer des tables grâce au Java

Étape 18 -
Hibernate permet de créer des tables et de les manipuler avec des objets Java

Étape 20 -
ID  	CONTENT  	CREATION
1	57 boulevard demorieux	2021-11-19 15:36:48.808528
2	51 allee du gamay, 34080 montpellier	2021-11-19 15:36:48.825483

Étape 23 -
L'annotation @Autowired vous épargne le besoin de faire le câblage par vous-même dans le fichier XML
(ou de toute autre manière) et trouve juste pour vous ce qui doit être injecté où, et le fait pour vous.

Étape 30 -

    1. Open the official bootstrap repo: https://getbootstrap.com/docs/4.0/getting-started/download/
    2. Go to Bootstrap CDN and copy the link given in the href attribute: https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css
    3. Open the link in a new tab and copy its contents to your project (preferably in a file under resources/static)
    4.Then, include this file using the link tag in your html files (In my case, th:href): <link th:href="@{/CSS/bootstrap.min.css}" rel="stylesheet">

TP4

Étape 6 -
-Oui il faut une clé API pour y accéder. Cette clé est limité en nombre d'appel dans la journée.
-Pour avoir la météo du jour il faut appeler 'https://api.meteo-concept.com/api/forecast/daily/0?token=MON_TOKEN&latlng=COORD_GPS' pour avoir la météo actuelle des coordonnées GPS données.
-Il faut utiliser la méthode HTTP GET pour récupérer les données de l'API.
-Pour passer des paramètres d'appel il suffit de mettre un ? à la fin de l'opération pui de rajouter NOM_ATTRIBUT=VALEUR_ATTRIBUT avec une & entre chaque attribut.
-Pour afficher la température du lieu visé par les coordonnées GPS elle se trouve dans forecast->temp2m
-Pour afficher la prévision de météo du lieu visé par les coordonnées GPS elle se trouve dans forecast->weather
