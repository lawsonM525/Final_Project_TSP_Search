# Depth-First Search in a Country of Cities

## Project Description & Requirements

This Java project simulates travel across cities in a country using a depth-first search (DFS) algorithm. It allows users to explore a dynamically created graph of cities (nodes) and roads (edges), each road having a distance attribute, by traversing from one city to another, keeping track of the total distance traveled.

- Contains a graph or a tree: Country class is a graph represented as an adjacency matrix. The user interaction part in Main.java allows users to grow the graph by adding new nodes (cities) and edges (roads) interactively. This ensures the graph is not hardwired/static.

- Uses a Java built-in data structure: The Country class uses a HashMap (a built-in Java data structure) where each city (key) maps to a list of roads (value). This representation allows the graph to be grown dynamically by inserting new cities and roads. The HashMap is suitable for this task because it allows constant time complexity for get and put operations.

- Uses inheritance: The Country class extends HashMap, demonstrating class inheritance.

- Contains at least one generic class: The project uses generic classes in several instances. For instance, ArrayList<Road> is a generic class used to store a list of road objects. Similarly, HashMap<City, ArrayList<Road>> is a generic class used to represent the graph.

- Creative integration of adjacency matrix: The Country class contains a toString method that prints the graph as an adjacency matrix. Each weight in the matrix represents the distance between two connected cities, and 0 represents no road between two cities. When a city is visited, this is represented in the matrix by surrounding the city name with "x - x". This method creatively integrates the use of adjacency matrices into the project.

## 2-Week Plan
### ~~Week 1:~~
#### ~~Day 1:~~
~~Define the City class with attributes like name, location, and a list of roads that connect it to other cities.~~

~~Define the Road class with attributes like start city, end city, and weight/distance.~~

~~Define the Graph class with a list of cities and methods to add cities and roads to the graph.~~

~~ representation with an adjaceny matrix ~~

#### ~~Day 2-3:~~

~~Implement a method to add cities to the Graph.~~

~~Implement a method to add roads to the Graph.~~

#### ~~Day 4-5:~~

~~Implement the depth-first search algorithm to traverse the Graph from one city to another.~~

~~Test the search algorithm by manually verifying the output with a few sample cities.~~

#### ~~Day 6:~~

~~Write Testers to verify the correctness of the methods.~~

~~Create test cases to check if the Graph, City, and Road classes are working correctly.~~

#### Day 7:
 
 Rest.

### Week 2:
#### Day 8-9:
Create a user interface with a menu that allows the users to interactively select two cities.

Implement the driver that allows the user to choose two cities and see the distance between them.

Test the driver with sample data.

#### Day 10-11:
Clean up the code, adding comments everywhere as needed.

#### Day 12:
Add error handling to the code to handle edge cases.

Test the code with edge cases like invalid input data.

#### Day 13 - 14:
Perform final testing and debugging on the code.

Document the code and submit the project.
