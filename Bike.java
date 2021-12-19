/*
 * This is the Bike class.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-12-18
 */

/** Bike class, extends Vehicle. */
public class Bike extends Vehicle {
    /** RPM of the bike. */
    private int cadence;

    /**
    * Instantiates a Truck.
    *
    * @param newColour the colour of the truck
    * @param newMaxSpeed the max speed
    * */
    public Bike(final String newColour, final int newMaxSpeed) {
        super(newColour, newMaxSpeed);
        this.cadence = 0;
    }

    /**
    * Gets cadence.
    *
    * @return cadence.
    * */
    public int getCadence() {
        return cadence;
    }

    /**
    * Sets cadence.
    *
    * @param newCadence the new cadence.
    * */
    public void setCadence(final int newCadence) {
        this.cadence = newCadence;
    }

    /** Rings bell. */
    public static void ringBell() {
        System.out.println("Ding!");
    }
}
