public class Client extends Human {

    public Client(String name, String phone, double money) {
        this.name=name;
        this.phone=phone;
        this.money = money;
    }

    public double getClientMoney(){
        return money;
    }


}
