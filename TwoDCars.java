public class TwoDCars {
    private String[][] modelMatrix;
    private double[][] priceMatrix;

    public TwoDCars () {
        modelMatrix = new String[3][3];
    
        modelMatrix[0][0] = "Myvi"; modelMatrix[0][1] = "City"; modelMatrix[0][2] = "Vios"; 
        modelMatrix[1][0] = "S50"; modelMatrix[1][1] = "CX-30"; modelMatrix[1][2] = "Nexis"; 
        modelMatrix[2][0] = "Atto 3"; modelMatrix[2][1] = "Axia"; modelMatrix[2][2] = "Saga"; 

        priceMatrix = new double [][] {
            {63000.00, 97000.00, 85000.00},
            {70000.00, 140000.00, 75000.00},
            {160000.00, 43000.00, 37000.00}
        };
    }   
    public void matrixDisplay (){

        for (int row=0; row<modelMatrix.length; row++) {
            for (int col=0; col<modelMatrix[row].length; col++) {
                System.out.print(modelMatrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("=====================================");
        for (double matrixRow[] : priceMatrix) {
            for (double matrixCol : matrixRow) {
                System.out.print("RM" + matrixCol + " ");
            }
            System.out.println(" ");
        }
    }
        public static void main(String[] args) {

        TwoDCars CarInput = new TwoDCars();
        CarInput.matrixDisplay();

        System.out.println("***************************************");
        System.out.println("Cars with prices greater than RM50000.00:");
        for (int row = 0; row < CarInput.priceMatrix.length; row++) {
            for (int col = 0; col < CarInput.priceMatrix[row].length; col++) {
                if (CarInput.priceMatrix[row][col] > 50000.00) {
                    System.out.println(
                        "Car: " + CarInput.modelMatrix[row][col] + ", Price: RM" + CarInput.priceMatrix[row][col]);
                }
            }
        }
    }
}   
