/**
 * Represents a Car object tracking year, model, total mileage, and fuel tank level.
 */
public class Car {
    // Instance variables
    private int year;
    private int miles;
    private String model;
    private double fuelTankLevel; // Stored as a percentage (0.0 to 100.0)

    /**
     * Constructor for objects of class Car.
     */
    public Car(int year, String model, int miles, double fuelTankLevel) {
        this.year = year;
        this.model = model;
        this.miles = miles;
        this.fuelTankLevel = fuelTankLevel;
    }

    // --- Part 2: Accessors ---

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getMiles() {
        return miles;
    }

    public double getFuelTankLevel() {
        return fuelTankLevel;
    }

    // --- Part 3: Mutator ---

    public void addMiles(int milesToAdd) {
        // TODO: Implement Part 3
    }

    // --- Part 4: Status Check ---

    public boolean isFuelTankEmpty() {
        // TODO: Implement Part 4
        return false;
    }

    // --- Part 5: Conversion Helper ---

    public double milesToFuelLevel(int miles) {
        // TODO: Implement Part 5 (400 miles = 100% fuel)
        return 0.0;
    }

    // --- Part 6: Fuel Level Modifier ---

    public void modifyFuelTankLevel(int miles) {
        // TODO: Implement Part 6
    }

    // --- Part 7: Drive Methods ---

    public String drive(int miles) {
        // TODO: Implement Part 7
        return "";
    }

    /**
     * Overloaded drive method: drives a random distance between 1 and 10 miles.
     */
    public String drive() {
        // TODO: Implement Overloaded drive()
        return "";
    }

    @Override
    public String toString() {
        return year + " " + model + " [Miles: " + miles + ", Fuel: " + fuelTankLevel + "%]";
    }
}