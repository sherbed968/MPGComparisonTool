import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scannerNumOfCars = new Scanner(System.in);

        //Get number of cars to compare
        int size = 0;
        while (size <= 0 || size > 4) {
            System.out.print("Enter Up to 4 Cars to Compare: ");
            size = isNumber(scannerNumOfCars);
        }

        
        //Get cost per gallon
        System.out.print("Enter Cost Per Gallon: ");
        float gasCost = scannerNumOfCars.nextFloat();

        //Create car objects
        Car[] car = new Car[size];

        //Prompt for each data point
        for (int i = 1; i < size + 1; i++) {
            Scanner scanner = new Scanner(System.in);  // Initialize each scanner
            String string;

            if (i == 1) {
                string = "st";
            }
            else if (i == 2) {
                string = "nd";
            }
            else if (i == 3) {
                string = "rd";
            }
            else {
                string = "th";
            }

            System.out.print("Enter " + i + string + " Cars City MPG: ");
            while (!scanner.hasNextFloat()) {
                System.out.print("Please Enter a Valid Number For City MPG: ");
                scanner.next();
            }
            float city = scanner.nextFloat();
            System.out.print("Enter " + i + string + " Cars Highway MPG: ");
            while (!scanner.hasNextFloat()) {
                System.out.print("Please Enter a Valid Number For City MPG: ");
                scanner.next();
            }
            float highway = scanner.nextFloat();
            System.out.print("Enter " + i + string + " Cars Gallons Per Tank: ");
            while (!scanner.hasNextFloat()) {
                System.out.print("Please Enter a Valid Number For City MPG: ");
                scanner.next();
            }
            float gallons = scanner.nextFloat();

            car[i - 1] = new Car(city, highway, gallons, gasCost);
        }

        for (int i = 0; i < car.length; i++) {
            System.out.println("Car " + (i + 1));
            System.out.println("Average Miles Per Tank: " + car[i].getMilesPerTank());
            System.out.println("Average Cost Per Tank: $" + car[i].getCostPerTank());
            System.out.println();
        }
    }

    private static int isNumber(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a number from 1 to 4: ");
            scanner.next();
        }
        int size = scanner.nextInt();
        return size;
    }
}
