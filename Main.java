/*
 * This class demonstrates the vehicle subclasses
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-12-11
 */

/** This is a stub program for the Vehicle subclasses. */
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
     * Creates 2 vehicle subclasses and uses its getters, setters and methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {

        final Truck truck = new Truck("Red", 250, "ASDF123");
        final Bike bike = new Bike("Blue", 75);

        final int placeholder = 50;
        final int placeholder2 = 100;

        truck.accelerate(placeholder);
        truck.provideAir(2);

        System.out.printf("\nLicense Plate: %s\nMax Speed: %s",
            truck.getLicensePlate(), truck.getMaxSpeed());
        System.out.printf("\nCurrent Speed: %s\nColour: %s\n\n",
            truck.getSpeed(), truck.getColour());

        bike.setCadence(placeholder2);
        bike.ringBell();

        System.out.printf("\nColour: %s\nMax Speed: %s",
            bike.getColour(), bike.getMaxSpeed());
        System.out.printf("\nCurrent Speed: %s\nCadence: %s\n",
            bike.getSpeed(), bike.getCadence());

        System.out.println("\nDone.");
    }
}

