package datastructure.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Graph {
    private int vertices;
    private LinkedList<Edge>[] adjList;

    static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(destination, weight);
        adjList[source].add(edge);
    }

    void shortestPath(int source) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>((e1, e2) -> e1.weight - e2.weight);
        priorityQueue.add(new Edge(source, 0));

        while (!priorityQueue.isEmpty()) {
            Edge currentEdge = priorityQueue.poll();
            int currentVertex = currentEdge.destination;

            for (Edge neighbor : adjList[currentVertex]) {
                int newDistance = distance[currentVertex] + neighbor.weight;

                if (newDistance < distance[neighbor.destination]) {
                    distance[neighbor.destination] = newDistance;
                    priorityQueue.add(new Edge(neighbor.destination, newDistance));
                }
            }
        }

        System.out.println("Shortest distances from source vertex " + source + ":");

        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertex " + i + ": " + distance[i]);
        }
    }


    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);

        // Adding edges to the graph
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 1);
        graph.addEdge(3, 1, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 3);

        int sourceVertex = 0;
        graph.shortestPath(sourceVertex);
    }


}
