import java.util.Scanner;

class Car {

    private float city;
    private float highway;
    private float gallons;
    private float gasCost;

    public Car(float city, float highway, float gallons, float gasCost) {
        this.city = city;
        this.highway = highway;
        this.gallons = gallons;
        this.gasCost = gasCost;
    }

    public float getCity() {
        return city;
    }

    public float getHighway() {
        return highway;
    }

    public float getGallons() {
        return gallons;
    }

    public float getGasCost() {
        return gasCost;
    }

    public float getMilesPerTank() {

        float avgMiles = ((getCity() + getHighway()) / 2) * getGallons();

        return avgMiles;
    }

    public float getCostPerTank() {
        float avgCost = (getCity() + getHighway() / 2) * getGasCost();

        return avgCost;
    }
}

