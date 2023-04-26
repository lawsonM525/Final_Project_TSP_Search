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

    public static void main(String[] args){

        // Creating the country: USA
        Country usa = new Country();
        // Creating the capital cities (east coast of the USA)
        City boston = new City("Boston");
        boston.name = "BOS";
        City albany = new City("Albany");
        albany.name = "ALB";
        City newyork = new City("New York");
        newyork.name = "NYC";
        City philadelphia = new City("Philadelphia");
        philadelphia.name = "PHL";
        City washington = new City("Washington");
        washington.name = "WAS";
        // Adding the cities to the country
        usa.addCity(boston);
        usa.addCity(albany);
        usa.addCity(newyork);
        usa.addCity(philadelphia);
        usa.addCity(washington);
        // Adding the roads between the cities
        usa.addRoad(boston, albany, 200.0);
        usa.addRoad(boston, newyork, 200);
        usa.addRoad(philadelphia, newyork, 200);
        usa.addRoad(newyork, albany, 200);
        usa.addRoad(philadelphia, albany, 500);
        usa.addRoad(philadelphia, washington, 200);
        //TODO: Finish adding roads


        // user interaction
        System.out.println("Welcome to the USA!");
        System.out.println("You are currently in Boston, Massachusetts.");
        System.out.println(usa);
        System.out.println("Where would you like to go?");
        printMenu();
        
        // User exploration

        City currentCity = boston;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(input.equals("1")||input.equals("Boston")||input.equals("boston")){
            usa.dfs(currentCity, boston, 0.0);
        }
        else if(input.equals("2")||input.equals("Albany")||input.equals("albany")){
            usa.dfs(currentCity, albany, 0.0);
        }
        else if(input.equals("3")||input.equals("New York")||input.equals("new york")){
            usa.dfs(currentCity, newyork, 0.0);
        }
        else if(input.equals("4")||input.equals("Philadelphia")||input.equals("philadelphia")){
            usa.dfs(currentCity, philadelphia, 0.0);
        }
        else if(input.equals("5")||input.equals("Washington")||input.equals("washington")){
            usa.dfs(currentCity, washington, 0.0);
        }
        else if(input.equals("exit")){
            System.out.println("Goodbye!");
            System.exit(0);
        }
        else{
            System.out.println("Invalid input. Please try again.");
        }

    }


    public static void mainBuild(){

    }


    public static void printMenu(){
        System.out.println("1. Boston");
        System.out.println("2. Albany");
        System.out.println("3. New York");
        System.out.println("4. Philadelphia");
        System.out.println("5. Washington");

        System.out.println("Type 'exit' to exit the program.");
    }





}