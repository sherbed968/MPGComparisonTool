import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scannerNumOfCars = new Scanner(System.in);

        //Get number of cars to compare and make sure entry is valid
        int numCars = isValid(scannerNumOfCars);

        //Get cost per gallon
        System.out.print("Enter Cost Per Gallon: ");
        while (!scannerNumOfCars.hasNextFloat()) {
            System.out.print("Please enter a valid number in the form (0.00): ");
            scannerNumOfCars.next();
        }
        float gasCost = scannerNumOfCars.nextFloat();

        //Create car array
        Car[] car = new Car[numCars];

        //Fill individual car objects and print
        createCarObj(numCars, car, gasCost);

        scannerNumOfCars.close();
    }

    private static int isNumber(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a number from 1 to 4: ");
            scanner.next();
        }
        int size = scanner.nextInt();
        return size;
    }

    private static int isValid(Scanner scanner) {
        int size = 0;
        while (size <= 0 || size > 4) {
            System.out.print("Enter Up to 4 Cars to Compare: ");
            size = isNumber(scanner);
        }
        return size;
    }

    private static void createCarObj(int numCars, Car[] car, float gasCost) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < numCars + 1; i++) {
            //Scanner scanner = new Scanner(System.in);  // Initialize each scanner
            String ordinal;

            if (i == 1) {
                ordinal = "st";
            }
            else if (i == 2) {
                ordinal = "nd";
            }
            else if (i == 3) {
                ordinal = "rd";
            }
            else {
                ordinal = "th";
            }

            System.out.print("Enter " + i + ordinal + " Cars City MPG: ");
            while (!scanner.hasNextFloat()) {
                System.out.print("Please Enter a Valid Number For City MPG: ");
                scanner.next();
            }
            float city = scanner.nextFloat();
            System.out.print("Enter " + i + ordinal + " Cars Highway MPG: ");
            while (!scanner.hasNextFloat()) {
                System.out.print("Please Enter a Valid Number For Highway MPG: ");
                scanner.next();
            }
            float highway = scanner.nextFloat();
            System.out.print("Enter " + i + ordinal + " Cars Gallons Per Tank: ");
            while (!scanner.hasNextFloat()) {
                System.out.print("Please Enter Valid Gallons Per Tank: ");
                scanner.next();
            }
            float gallons = scanner.nextFloat();

            car[i - 1] = new Car(city, highway, gallons, gasCost);
        }

        for (int i = 0; i < car.length; i++) {
            System.out.println();
            System.out.println("Car " + (i + 1));
            System.out.println("Average Miles Per Tank: " + car[i].getMilesPerTank());
            System.out.println("Average Cost Per Tank: $" + car[i].getCostPerTank());
        }
        scanner.close();
    }
}
