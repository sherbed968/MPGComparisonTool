import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerNumOfCars = new Scanner(System.in);

        System.out.print("Enter Number of Cars to Compare: ");
        int size = scannerNumOfCars.nextInt();

        System.out.print("Enter Cost Per Gallon: ");
        float gasCost = scannerNumOfCars.nextFloat();

        Car[] car = new Car[size];

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
            float city = scanner.nextFloat();
            System.out.print("Enter " + i + string + " Cars Highway MPG: ");
            float highway = scanner.nextFloat();
            System.out.print("Enter " + i + string + " Cars Gallons Per Tank: ");
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
}