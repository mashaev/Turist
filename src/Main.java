import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Operator kyrgyzConcept = new Operator("Kyrgyz Concept","99434343",20000);
        Client client = new Client("Timur","99998887",30000) ;



     kyrgyzConcept.addTour("Dubai",15000,50,true);
        kyrgyzConcept.addTour("Egypt",10000,20,false);

 /*  ArrayList<Tour> serchedTours = kyrgyzConcept.findToursByCountry("Egypt");



    for (Tour tour: serchedTours){
        if (client.getClientMoney() >=tour.getPrice()){
            System.out.println("Money enough");
        }
    }*/

     /* ArrayList<Tour> serchedTour = kyrgyzConcept.findToursByHot(true);

      for (Tour tour:serchedTour){
          System.out.println(tour.getCountry() + " - " + tour.getPrice());
      }*/

        System.out.println(kyrgyzConcept.money);
      kyrgyzConcept.sellTour("Egypt");
        System.out.println(kyrgyzConcept.money);



        ArrayList<Tour> serchedTours = kyrgyzConcept.findToursByCountry("Egypt");

        for (Tour tour: serchedTours){
            System.out.println(tour.getFreeSpace());

        }
    }
}
