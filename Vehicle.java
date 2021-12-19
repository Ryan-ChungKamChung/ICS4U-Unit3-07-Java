/*
 * This class is a Vehicle blueprint.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-12-11
 */

/** The class of a Vehicle. */
public class Vehicle {
    /** The vehicle's speed. */
    protected private int speed;
    /** The vehicle's colour. */
    private String colour;
    /** The vehicle's max speed. */
    private final int maxSpeed;

    /**
     * Instantiates a Vehicle.
     *
     * @param newColour sets the colour
     * @param newMaxSpeed sets the max speed
     * */
    public Vehicle(final String newColour, final int newMaxSpeed) {
        this.colour = newColour;
        this.maxSpeed = newMaxSpeed;
        this.speed = 0;
    }

    /**
     * Gets the car colour.
     *
     * @return the car colour
     * */
    public String getColour() {
        return this.colour;
    }

    /**
     * Sets the car colour.
     *
     * @param newColour the new car colour
     * */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    /**
     * Gets the max speed.
     *
     * @return the max speed
     * */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Gets the speed.
     *
     * @return the speed
     * */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Increases the speed.
     *
     * @param accelerateBy increase the speed by this amount
     * */
    public void accelerate(final int accelerateBy) {
        this.speed += accelerateBy;
    }

    /**
     * Decreases the speed.
     *
     * @param brakeBy decrease the speed by this amount
     * */
    public void brake(final int brakeBy) {
        this.speed -= brakeBy;
    }
}

