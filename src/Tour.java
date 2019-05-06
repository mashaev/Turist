

public class Tour {

    private String country;
    private double price;
    private int freeSpace;
    private boolean isHot;




    public Tour(String country, double price, int freeSpace, boolean isHot) {
        this.country = country;
        this.price = price;
        this.freeSpace = freeSpace;
        this.isHot = isHot;
    }

    public String getCountry() {
        return country;
    }

    public double getPrice() {
        return price;
    }


    public int getFreeSpace() {
        return freeSpace;
    }

    public boolean isHot() {
        return isHot;
    }

    public void bookPlace(){
        freeSpace -=1;
    }
}
