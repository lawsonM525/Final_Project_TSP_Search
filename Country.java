import java.util.ArrayList;
import java.util.HashMap;

// Q: is it okay to represent it as a HashMap?
// Can't seem to extend Graph, it's not a class in Java, it's in Javax.ide.util
public class Country extends HashMap<City, ArrayList<Road>> {

    /**
     * Constructor for Country class.
     */
    public Country() {
        super();
    }


    /**
     * Adds a city to the country.
     * @param city
     */
    public void addCity(City city) {
        put(city, new ArrayList<Road>());
    }

    /**
     * Adds a road between two cities with the specified distance/weight.
     *
     * @param startCity The starting city of the road.
     * @param destinationCity The destination city of the road.
     * @param distance The distance/weight of the road.
     */
    public void addRoad(City startCity, City destinationCity, double distance) {
        // Create a new Road object with the given parameters
        Road road = new Road(startCity, destinationCity, distance);
        
        // Check if the start city already has roads
        if (containsKey(startCity)) {
            // If it does, add the new road to the existing list
            get(startCity).add(road);
        } else {
            // If it doesn't, create a new list and add the road to it
            ArrayList<Road> roads = new ArrayList<>();
            roads.add(road);
            put(startCity, roads);
        }
    }
    

    /**
     * Prints out the graph as an adjacency matrix with each weight being the distance between two cities.
     * 0 represents no road between two cities.
     * 
     * @return The adjacency matrix as a string.
     */
    public String toString() {
        // Get all vertices in the graph
        ArrayList<City> vertices = new ArrayList<>(keySet());
      
        // Initialize a matrix with all values set to zero
        double[][] adjacencyMatrix = new double[vertices.size()][vertices.size()];
        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < vertices.size(); j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
      
        // Set the values in the matrix to the distances between connected cities
        for (City city1 : vertices) {
            ArrayList<Road> roads = get(city1);
            for (Road road : roads) {
                City city2 = road.getDestinationCity();
                int index1 = vertices.indexOf(city1);
                int index2 = vertices.indexOf(city2);
                double distance = road.getDistance();
                adjacencyMatrix[index1][index2] = distance;
            }
        }
      
        // Convert the matrix to a string and return it
        StringBuilder sb = new StringBuilder();
        sb.append("Country:\n");
    
        // Append the header row with the city names
        sb.append("\t");
        for (City city : vertices) {
            sb.append(city.getName());
            sb.append("\t");
        }
        sb.append("\n");
    
        // Append the matrix rows with the city names and the corresponding distances
        for (int i = 0; i < vertices.size(); i++) {
            sb.append(vertices.get(i).getName());
            sb.append("\t");
            for (int j = 0; j < vertices.size(); j++) {
                sb.append(adjacencyMatrix[i][j]);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    
    
}
