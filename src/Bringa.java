public class Bringa {

    public Bringa (boolean fekezes, int sebesseg){
        if (fekezes == false && sebesseg >= 50) {
            System.out.println("A fék nincs behúzva! Túl gyorsan mész, lassítanod kéne! A sebességed: " + sebesseg);
        } else if (fekezes == true && sebesseg >= 50){
            System.out.println("A fék működik, lassulni fogsz.");
        } else  {
            System.out.println("A sebességed biztonságos!");
        }

    }

}


