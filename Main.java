/*
 * This program is a stub for the vehicle class.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-12-11
 */

/** This is a stub program for the Vehicle class. */
final class Main {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Prints a formatted String output.
     *
     * @param vehicle Vehicle class
     * */
    public static void formatted(final Vehicle vehicle) {
        System.out.println("\nLicense Plate: " + vehicle.getLicensePlate()
                + "\nColour: " + vehicle.getColour()
                + "\nNumber of Doors: " + vehicle.getNumOfDoors()
                + "\nMax Speed: " + vehicle.getMaxSpeed()
                + "\nCurrent Speed: " + vehicle.getSpeed());
    }

    /**
     * Creates 2 vehicle classes and uses its getters, setters and methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {

        Bike bike = new Bike("red", 30);
        Truck truck = new Truck("blue", 50, "A")

        System.out.println("\nDone.");
    }
}
