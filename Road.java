/**
 * The Road class represents a road that connects two cities in the country graph. Each road has a starting city,
 * a destination city, and a distance/weight.
 */
public class Road {

    // Class variables
    City startCity;
    City destinationCity;
    double distance;

    /**
     * Constructor for Road class.
     *
     * @param startCity - The starting city of the road.
     * @param destinationCity - The destination city of the road.
     * @param distance - The distance/weight of the road.
     */
    public Road(City startCity, City destinationCity, double distance) {
        this.startCity = startCity;
        this.destinationCity = destinationCity;
        this.distance = distance;
    }

    /**
     * Returns the starting city of the road.
     *
     * @return The starting city of the road.
     */
    public City getStartCity() {
        return this.startCity;
    }

    /**
     * Returns the destination city of the road.
     *
     * @return The destination city of the road.
     */
    public City getDestinationCity() {
        return this.destinationCity;
    }

    /**
     * Returns the distance/weight of the road.
     *
     * @return The distance/weight of the road.
     */
    public double getDistance() {
        return this.distance;
    }

    /**
     * Returns a string representation of the Road object.
     *
     * @return The string representation of the Road object.
     */
    public String toString() {
        return "Road from " + this.startCity.getName() + " to " + this.destinationCity.getName() + " with distance " + this.distance + "m.";
    }
}
