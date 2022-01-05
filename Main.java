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
    * Formatted truck output.
    *
    * @param truck Truck object
    */
    public static void truckFormat(final Truck truck) {
        System.out.printf("\nLicense Plate: %s\nMax Speed: %s",
            truck.getLicensePlate(), truck.getMaxSpeed());
        System.out.printf("\nSpeed: %s\nColour: %s\n\n",
            truck.getSpeed(), truck.getColour());
    }

    /**
    * Formatted bike output.
    *
    * @param bike Bike object
    */
    public static void bikeFormat(final Bike bike) {
        System.out.printf("\nColour: %s\nMax Speed: %s",
            bike.getColour(), bike.getMaxSpeed());
        System.out.printf("\nSpeed: %s\nCadence: %s\n\n",
            bike.getSpeed(), bike.getCadence());
    }

    /**
     * Creates 2 vehicle subclasses and uses its getters, setters and methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {

        final Truck truck = new Truck("Red", 250, "ASDF123");
        final Bike bike = new Bike("Blue", 75);
        final int placeholder = 100;

        truckFormat(truck);
        System.out.println("Changing license plate...");
        truck.setLicensePlate("ASDF111");
        System.out.println("Changing Colour...");
        truck.setColour("Black");
        System.out.println("Accelerating...");
        truck.accelerate(2);
        System.out.println("Providing Air...");
        truck.provideAir(2);
        truckFormat(truck);

        bikeFormat(bike);
        System.out.println("Changing cadence...");
        bike.setCadence(placeholder);
        System.out.println("Changing speed...");
        bike.accelerate(placeholder);
        bike.ringBell();
        bikeFormat(bike);

        System.out.println("\nDone.");
    }
}

