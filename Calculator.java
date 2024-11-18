
public class Calculator {
    private String carModel ;
    private String carMaker ;
    private double carPrice ;

    public Calculator (String carModel, String carMaker, double carPrice) {
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

        Calculator firstCar = new Calculator("S60","Volvo", 317000.79 );
        Calculator secondCar = new Calculator("330i","BMW", 438700.00 );
        Calculator thirdCar = new Calculator("Arteon","Volkswagen", 279100.00 );

        firstCar.displayCarDetails();
        secondCar.displayCarDetails();
        thirdCar.displayCarDetails();

        System.out.println("Average Car Price is :" + (firstCar.carPrice + secondCar.carPrice + thirdCar.carPrice)/3);

    }
}
