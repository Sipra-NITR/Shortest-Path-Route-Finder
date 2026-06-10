package Project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Graph graph = new Graph();

        System.out.print("Enter number of roads: ");
        int roads = sc.nextInt();

        System.out.println(
                "\nEnter roads in format:\n" +
                "Source Destination Distance");

        for (int i = 0; i < roads; i++) {

            String source = sc.next();
            String destination = sc.next();
            int distance = sc.nextInt();

            graph.addRoad(
                    source,
                    destination,
                    distance);
        }

        sc.nextLine();

        System.out.print("\nEnter source city: ");
        String sourceCity = sc.nextLine();

        System.out.print("Enter destination city: ");
        String destinationCity = sc.nextLine();

        Dijkstra.findShortestPath(
                graph,
                sourceCity,
                destinationCity);

        sc.close();
    }
}
