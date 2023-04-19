import java.util.ArrayList;
import java.util.List;

/**
 * The City class represents a city in the country graph. Each city has a name, a location, and a list of roads that connect
 * it to other cities in the country.
 */
public class City {

    // Class variables
    String name;
    String location;
    List<Road> roads;

    /**
     * Constructor for City class.
     *
     * @param name - The name of the city.
     * @param location - The location of the city.
     */
    public City(String name, String location) {
        this.name = name;
        this.location = location;
        this.roads = new ArrayList<Road>();
    }

    /**
     * Returns the name of the city.
     *
     * @return The name of the city.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the location of the city.
     *
     * @return The location of the city.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Returns the list of roads connected to this city.
     *
     * @return The list of roads connected to this city.
     */
    public List<Road> getRoads() {
        return this.roads;
    }

    /**
     * Adds a new road connecting this city to another city in the country.
     *
     * @param destination - The city that this road connects to.
     * @param distance - The distance/weight of the road.
     */
    public void addRoad(City destination, double distance) {
        Road newRoad = new Road(this, destination, distance);
        this.roads.add(newRoad);
    }

    /**
     * Returns a string representation of the City object.
     *
     * @return The string representation of the City object.
     */
    public String toString() {
        return "City name: " + this.name + ", Location: " + this.location;
    }
}
