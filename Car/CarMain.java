/**
 * Driver class to test the Car class implementation and run a driving simulation.
 */
public class CarMain {
    public static final int GOAL = 100;

    public static void main(String[] args) {
        Car car1 = new Car(2019, "Honda CRV", 11000, 100.0);
        Car car2 = new Car(1969, "Volkswagon Beetle", 200000, 100.0);

        // Run unit test methods
        accessorTest(car1);
        addMilesTest(car1, 150);
        isFuelTankEmptyTests(car1);
        milesToFuelLevelTests(car1);
        modifyFuelTankLevelTests(car1);

        System.out.println("\n--- Race to 100 Miles ---");
        int count1 = 0;
        int count2 = 0;

        // Race loop: continuous driving until one car covers 100 miles
        while (count1 < GOAL && count2 < GOAL) {
            String status1 = car1.drive();   // Drives random 1-10 miles
            String status2 = car2.drive(5);  // Drives fixed 5 miles

            System.out.println("Car 1: " + status1);
            System.out.println("Car 2: " + status2);

            count1 = car1.getMiles() - 11000;
            count2 = car2.getMiles() - 200000;

            if (car1.isFuelTankEmpty() || car2.isFuelTankEmpty()) {
                System.out.println("A car ran out of fuel!");
                break;
            }
        }

        // Output race winner
        if (count1 >= GOAL && count2 >= GOAL) {
            System.out.println("\nIt's a tie!");
        } else if (count1 >= GOAL) {
            System.out.println("\nCar 1 won the race!");
        } else if (count2 >= GOAL) {
            System.out.println("\nCar 2 won the race!");
        }
    }

    public static void accessorTest(Car mine) {
        System.out.println("--- Testing Accessors ---");
        System.out.println("Year: " + mine.getYear());
        System.out.println("Model: " + mine.getModel());
        System.out.println("Miles: " + mine.getMiles());
        System.out.println("Fuel Level: " + mine.getFuelTankLevel() + "%");
    }

    public static void addMilesTest(Car mine, int miles) {
        System.out.println("\n--- Testing addMiles ---");
        System.out.println("Starting miles: " + mine.getMiles());
        mine.addMiles(miles);
        System.out.println("Miles after adding " + miles + ": " + mine.getMiles());
    }

    public static void isFuelTankEmptyTests(Car mine) {
        System.out.println("\n--- Testing isFuelTankEmpty ---");
        if (mine.isFuelTankEmpty()) {
            System.out.println("Better start walking!");
        } else {
            System.out.println("Fuel tank is not empty.");
        }
    }

    public static void milesToFuelLevelTests(Car mine) {
        System.out.println("\n--- Testing milesToFuelLevel ---");
        System.out.println("100 miles consumed = " + mine.milesToFuelLevel(100) + "% fuel");
    }

    public static void modifyFuelTankLevelTests(Car mine) {
        System.out.println("\n--- Testing modifyFuelTankLevel ---");
        mine.modifyFuelTankLevel(100);
        System.out.println("Fuel level after driving 100 miles: " + mine.getFuelTankLevel() + "%");
    }
}