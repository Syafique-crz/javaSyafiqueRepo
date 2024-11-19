import java.util.Scanner;
    
public class SwitchCar {
    private String carModel ;
    private String carMaker ;
    private double carPrice =0.0 ;
    Scanner scanner = new Scanner(System.in); 

    public SwitchCar () {

        System.out.print("Insert the car model: "); 
        this.carModel = scanner.nextLine(); 
        System.out.print("Insert the car maker: "); 
        this.carMaker = scanner.nextLine(); 

    }

    public void carDtbase (){
        switch (this.carModel) {
            case "Myvi":
                carModel = "Myvi";
                carPrice = 63000.00;
                break;
            case "City":
                carModel = "City";
                carPrice = 97000.00;
                break;
            case "Vios":
                carModel = "Vios";
                carPrice = 85000.00;
                break;
            case "S50":
                carModel = "S50";
                carPrice = 70000.00;
                break;
            case "CX-30":
                carModel = "CX-30";
                carPrice = 140000.00;
                break;
            case "Nexis":
                carModel = "Nexis";
                carPrice = 75000.00;
                break;
            case "Atto 3":
                carModel = "Atto 3";
                carPrice = 160000.00;
                break;
            default:
                carModel = "Input car not found!";
                carPrice = 0;
                System.out.println("\nYour selected car is not available");
                break;
        }
        System.out.println("Your selected car is " + carMaker+" "+carModel + " and it's price is RM " + carPrice);
    }
    public static void main(String[] args) {

        SwitchCar firstCar = new SwitchCar();
        firstCar.carDtbase();
        
        if (firstCar.carPrice >= 100000.00){
            System.out.println("\nYou are our VIP Buyer and \nThanks for your purchase");
        } else{
            System.out.println("\nThanks for your purchase");
        } 
    }
}
