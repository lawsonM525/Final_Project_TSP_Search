// Country class is a Map representation of the graph of cities and roads.

import java.util.ArrayList;
import java.util.HashMap;


public class Country extends HashMap<City, ArrayList<Road>> {

    String name;

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
        Road reverseRoad = new Road(destinationCity, startCity, distance);
        
        // Check if the start city already has roads
        if (containsKey(startCity)) {
            // If it does, add the new road to the existing list
            get(startCity).add(road);
            // adding reverse road to make roads bi directional
            get(destinationCity).add(reverseRoad);
        } else {
            // If it doesn't, create a new list and add the road to it
            ArrayList<Road> roads = new ArrayList<>();
            roads.add(road);
            put(startCity, roads);
            get(destinationCity).add(reverseRoad);
        }


    }

    /**
     * Finds city with the given name in the country
     * @param name name of city to be found
     * @return city with given name
     */
    public City getCity(String name) {
        for (City city : keySet()) {
            if (city.getName().equals(name)) {
                return city;
            }
        }
        System.out.println("City not found");
        return null;
    }

    /**
     * Does a depth-first search from a start city to an end city, keeping track of the distance traveled.
     * @param start
     * @param end
     * @param totalDistance
     */
    public double dfs(City start, City end, double totalDistance) {
        start.setVisited(true); // mark the start city as visited

        // base case
        // if the end city is reached, return the distance to the end city
        if (start.equals(end)) {
            System.out.println("Reached end city: " + end.getName());
            System.out.println("===> TOTAL DISTANCE: " + totalDistance + " miles");
            return totalDistance;
        }

        // update on current state of traveler
        System.out.println("Current city: " + start.getName());
        System.out.println("Current total distance: " + totalDistance + " miles");
    
        // iterate through all the roads of the current city
        for (Road road : get(start)) {
            City destinationCity = road.getDestinationCity();
    
            // if the destination city has not been visited yet, print the current state of the map and then perform DFS on it
            if (!destinationCity.isVisited()) {
                System.out.println(this.toString());
                return dfs(destinationCity, end, totalDistance + road.getDistance());
            }
        }

        // if no roads are found, return -1
        return -1;
    }

    /**
     * Wrapper method for dfs.
     * @param start start city
     * @param end end city
     * @return distance traveled
     */
    public double dfs(City start, City end) {
        return dfs(start, end, 0);
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
            if (city.isVisited()) {
                sb.append("x-"+city.getName()+"-x");
            }
            else{
                sb.append(city.getName());
            }
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
