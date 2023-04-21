public class CountryTester {

    public static void main(String[] args) {
        Country c = new Country();
        System.out.println("STARTING TESTS");
        System.out.println(" ");

        // Test addRoad method
        System.out.println("Testing addRoad method");
        System.out.println(" Creating cities A and B");
        City city1 = new City("A");
        City city2 = new City("B");
        System.out.println(" Adding cities A and B to country");
        c.addCity(city1);
        c.addCity(city2);
        System.out.println(" Adding road from A to B with distance 10.0");
        c.addRoad(city1, city2, 10.0);
        System.out.println(" ");

        // Test toString method
        System.out.println("Testing toString method");
        System.out.println(c.toString());
        System.out.println(" ");

        //Extended Tests
        //Adding more cities
        System.out.println("Expanding country");
        System.out.println("Adding cities C, D, E, and F");
        City city3 = new City("C");
        c.addCity(city3);
        City city4 = new City("D");
        c.addCity(city4);
        City city5 = new City("E");
        c.addCity(city5);
        City city6 = new City("F");
        c.addCity(city6);
        System.out.println("Adding roads : A-C, B-D, C-E, D-F, E-F");
        c.addRoad(city1, city3, 15.0);
        c.addRoad(city2, city4, 20.0);
        c.addRoad(city3, city5, 5.0);
        c.addRoad(city4, city6, 10.0);
        c.addRoad(city5, city6, 25.0);
        System.out.println(" ");
        System.out.println(c.toString());
        System.out.println(" ");
        System.out.println("ENDING TESTS");
    }
}
