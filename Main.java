// This class allows for the user to interact with the program (with a pre-defined country, the USA) 
// The user is able to watch how the DFS algorithm searches from one state of the country to another.
import java.util.Scanner;

public class Main {
    
    static Country usa;
    static City boston;
    static City albany;
    static City newyork;
    static City philadelphia;
    static City washington;
    static City richmond;
    static City raleigh;
    static City atlanta;
    static City jacksonville;
    static City miami;
    static City hartford;

    public static void main(String[] args){

        mainBuild();
        // user interaction
        System.out.println("Welcome to the USA!");
        System.out.println("You are currently in Boston, Massachusetts.");
        System.out.println(usa);
        System.out.println("Where would you like to go?");
        printMenu();
        explore(usa, boston);

    }


    public static void mainBuild(){
        // Creating the country: USA
        Country usa = new Country();
        // Creating the capital cities (east coast of the USA)
        City boston = new City("Boston");
        City albany = new City("Albany");
        City newyork = new City("New York");
        City philadelphia = new City("Philadelphia");
        City washington = new City("Washington");
        City richmond = new City("Richmond");
        City raleigh = new City("Raleigh");
        City atlanta = new City("Atlanta");
        City jacksonville = new City("Jacksonville");
        City miami = new City("Miami");
        City hartford = new City("Hartford");
        // Adding the cities to the country
        usa.addCity(boston);
        usa.addCity(albany);
        usa.addCity(newyork);
        usa.addCity(philadelphia);
        usa.addCity(washington);
        usa.addCity(richmond);
        usa.addCity(raleigh);
        usa.addCity(atlanta);
        usa.addCity(jacksonville);
        usa.addCity(miami);
        // Adding the roads between the cities
        usa.addRoad(boston, albany, 200.0);
        usa.addRoad(boston, hartford, 200);
        usa.addRoad(hartford, newyork, 200);
        usa.addRoad(newyork, albany, 200);
        usa.addRoad(philadelphia, albany, 500);
        usa.addRoad(philadelphia, washington, 200);
        //TODO: Finish adding roads
    }


    public static void printMenu(){
        System.out.println("1. Boston");
        System.out.println("2. Albany");
        System.out.println("3. New York");
        System.out.println("4. Philadelphia");
        System.out.println("5. Washington");
        System.out.println("6. Richmond");
        System.out.println("7. Raleigh");
        System.out.println("8. Atlanta");
        System.out.println("9. Jacksonville");
        System.out.println("10. Miami");
        System.out.println("11. Hartford");
        System.out.println("Type 'exit' to exit the program.");
    }

    public static void explore(Country country, City currentCity){

                Scanner scan = new Scanner(System.in);
                // game loop to accept user input
                while(true){

                    String input = scan.nextLine();

                    if(input.equals("exit")){
                        break;
                    }
                    else{
                        //case switch to determine where the user wants to go
                        switch(input){
                            case "Albany":
                                System.out.println("Distance from "+ currentCity.name +" to Albany: " + country.dfs(currentCity, albany, 0.0));
                                currentCity = albany;
                                break;
                            case "Boston":
                                System.out.println("Distance from "+ currentCity.name +" to Boston: " + country.dfs(currentCity, boston, 0.0));
                                currentCity = boston;
                                break;
                            case "New York":
                                System.out.println("Distance from "+ currentCity.name +" to New York: " + country.dfs(currentCity, newyork, 0.0));
                                currentCity = newyork;
                                break;
                            case "Philadelphia":
                                System.out.println("Distance from "+ currentCity.name +" to Philadelphia: " + country.dfs(currentCity, philadelphia, 0.0));
                                currentCity = philadelphia;
                                break;
                            case "Washington":
                                System.out.println("Distance from "+ currentCity.name +" to Washington: " + country.dfs(currentCity, washington, 0.0));
                                currentCity = washington;
                                break;
                            case "Richmond":
                                System.out.println("Distance from "+ currentCity.name +" to Richmond: " + country.dfs(currentCity, richmond, 0.0));
                                currentCity = richmond;
                                break;
                            case "Raleigh":
                                System.out.println("Distance from "+ currentCity.name +" to Raleigh: " + country.dfs(currentCity, raleigh, 0.0));
                                currentCity = raleigh;
                                break;
                            case "Atlanta":
                                System.out.println("Distance from "+ currentCity.name +" to Atlanta: " + country.dfs(currentCity, atlanta, 0.0));
                                currentCity = atlanta;
                                break;
                            case "Jacksonville":
                                System.out.println("Distance from "+ currentCity.name +" to Jacksonville: " + country.dfs(currentCity, jacksonville, 0.0));
                                currentCity = jacksonville;
                                break;
                            case "Miami":
                                System.out.println("Distance from "+ currentCity.name +" to Miami: " + country.dfs(currentCity, miami, 0.0));
                                currentCity = miami;
                                break;
                            case "Hartford":
                                System.out.println("Distance from "+ currentCity.name +" to Hartford: " + country.dfs(currentCity, hartford, 0.0));
                                currentCity = hartford;
                                break;
                            default:
                                System.out.println("Sorry, that is not a valid location.");
                                break;
                        }
        
                    }
                    scan.close();

    }




}
}
