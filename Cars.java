public class Cars {
    private String carModel ;
    private String carMaker ;
    private double carPrice ;

    public Cars (String carModel, String carMaker, double carPrice) {
        this.carModel = carModel;
        this.carMaker = carMaker;
        this.carPrice = carPrice;

    }
    public void displayCarDetails(){
        System.out.println("Car model is:" + carModel );
        System.out.println("Car Maker is:" + carMaker);
        System.out.println("Car Price is :RM" + carPrice);
    }

    public static void main(String[] args) {

        Cars firstCar = new Cars("S60","Volvo", 317000.79 );
        firstCar.displayCarDetails();

    }
}
