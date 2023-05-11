// This class allows for the user to interact with the program 
// The user is able to watch how the DFS algorithm searches from one state of the country to another.
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // User creates country with cities

        Country country = new Country();  // Create a new Country object
        Scanner scanner = new Scanner(System.in);  // Create a new Scanner object for user input
        System.out.println("Welcome to the Virtual Traveller!");
        System.out.println("Please enter the name of your country: ");
        String countryName = scanner.nextLine();  // User inputs the country name
        country.name = countryName;  // Set the country name to the inputted name
        System.out.println("Please enter the number of cities in your country: ");
        int numCities = scanner.nextInt();  // User inputs the number of cities in the country
        scanner.nextLine();  // Consume newline left-over
        for (int i = 0; i < numCities; i++) {  // For each city...
            System.out.println("Please enter the name of city " + (i + 1) + ": ");
            String cityName = scanner.nextLine();  // User inputs the city name
            City city = new City(cityName);  // Create a new City object with the inputted name
            country.addCity(city);  // Add the city to the country
        }

        // User creates roads between cities

        System.out.println("Please enter the number of roads in your country: "); 
        int numRoads = scanner.nextInt();  // User inputs the number of roads in the country
        scanner.nextLine();  // Consume newline left-over
        for (int i = 0; i < numRoads; i++) {  // For each road...
            System.out.println("Please enter the name of the starting city of road " + (i + 1) + ": ");
            String startCityName = scanner.nextLine();  // User inputs the starting city name
            System.out.println("Please enter the name of the destination city of road " + (i + 1) + ": ");
            String destinationCityName = scanner.nextLine();  // User inputs the destination city name
            System.out.println("Please enter the distance of road " + (i + 1) + ": ");
            double distance = scanner.nextDouble();  // User inputs the distance of the road
            scanner.nextLine();  // Consume newline left-over
            City startCity = country.getCity(startCityName);  // Get the City object for the starting city
            City destinationCity = country.getCity(destinationCityName);  // Get the City object for the destination city
            country.addRoad(startCity, destinationCity, distance);  // Add the road to the country
        }

        // User chooses starting and destination cities

        System.out.println("Please enter the name of the starting city: ");
        String startCityName = scanner.nextLine();  // User inputs the starting city name
        System.out.println("Please enter the name of the destination city: ");
        String destinationCityName = scanner.nextLine();  // User inputs the destination city name
        City startCity = country.getCity(startCityName);  // Get the City object for the starting city
        City destinationCity = country.getCity(destinationCityName);  // Get the City object for the destination city

        // DFS traversal from starting city to destination city

        System.out.println("Starting DFS traversal from " + startCityName + " to " + destinationCityName + "...");
        country.dfs(startCity, destinationCity);  // DFS traversal from starting city to destination city
        System.out.println("DFS traversal complete!");

        // Program ends

        System.out.println("Thank you for using the Virtual Traveller!");
        scanner.close();  // Close the Scanner object
    }

}