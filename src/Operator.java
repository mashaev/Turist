import java.util.ArrayList;

public class Operator extends Human {

    ArrayList<Tour> tours = new ArrayList<>();

    public Operator(String name, String phone, double money) {
        this.name=name;
        this.phone=phone;
        this.money = money;
    }

    public void addTour(String country, double price, int places, boolean isHot){
        tours.add(new Tour(country, price, places,isHot));
    }

   public ArrayList<Tour> findToursByCountry(String country){
        ArrayList<Tour> matchedTours = new ArrayList<>();

        for (Tour tour:tours){
      String tourCountry = tour.getCountry();
       if (tourCountry.equals(country)){
           matchedTours.add(tour);
       }

        }

        return matchedTours;
   }

   public ArrayList<Tour> findToursByHot(boolean isHot){
        ArrayList<Tour> matchedTours = new ArrayList<>();

        for (Tour tour:tours){
            if (tour.isHot()== isHot){

            }
        }

        return matchedTours;
   }

   public void sellTour(String country){

    for (Tour tour:tours){
        if (tour.getCountry().equals(country)){
            money +=tour.getPrice();
            tour.bookPlace();
            System.out.println("Ticket is sold");
        }
    }

   }
}
