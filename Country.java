import java.util.ArrayList;

public class Country extends Graph<City> {

    /**
     * Adds a road between two cities with the specified distance/weight.
     *
     * @param startCity The starting city of the road.
     * @param destinationCity The destination city of the road.
     * @param distance The distance/weight of the road.
     */
    public void addRoad(City startCity, City destinationCity, double distance) {
        Road road = new Road(startCity, destinationCity, distance);
        addEdge(startCity, destinationCity, road);
    }

    /**
     * Returns the distance/weight of the road between the specified cities.
     *
     * @param startCity The starting city of the road.
     * @param destinationCity The destination city of the road.
     * @return The distance/weight of the road between the specified cities, or -1 if there is no road between them.
     */
    public double getDistanceBetweenCities(City startCity, City destinationCity) {
        ArrayList<Road> roads = getEdges(startCity, destinationCity);
        if (roads.size() == 0) {
            return -1;
        } else {
            return roads.get(0).getDistance();
        }
    }
}
