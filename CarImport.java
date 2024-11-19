import java.util.Scanner; // Import the Scanner class

public class CarImport {
    private String carModel ;
    private String carMaker ;
    private double carPrice ;
    Scanner scanner = new Scanner(System.in); 

    public CarImport () {

        System.out.print("Insert the car model: "); 
        this.carModel = scanner.nextLine(); 
        System.out.print("Insert the car maker: "); 
        this.carMaker = scanner.nextLine(); 
        System.out.println("Insert the car price:");
        this.carPrice = scanner.nextDouble();

    }
    public void displayCarDetails(){
        System.out.println("Car Model is:" + carModel );
        System.out.println("Car Maker is:" + carMaker);
        System.out.println("Car Price is :RM" + carPrice);
        
    }
    public static void main(String[] args) {

        CarImport firstCar = new CarImport();
        CarImport secondCar = new CarImport();
        CarImport thirdCar = new CarImport();

        firstCar.displayCarDetails();
        secondCar.displayCarDetails();
        thirdCar.displayCarDetails();

        System.out.println("\nAverage Car Price is :" + (firstCar.carPrice + secondCar.carPrice + thirdCar.carPrice)/3);

    }
    
}