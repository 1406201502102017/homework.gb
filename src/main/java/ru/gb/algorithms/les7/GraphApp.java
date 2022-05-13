package ru.gb.algorithms.les7;

import org.junit.Test;

public class GraphApp {

    @Test
    public static void findWay() {

        Graph graph = new Graph(10);

        graph.addEdge(0, 4);
        graph.addEdge(0, 2);
        graph.addEdge(0, 1);
        graph.addEdge(2, 7);
        graph.addEdge(2, 8);
        graph.addEdge(3, 9);
        graph.addEdge(3, 6);
        graph.addEdge(3, 5);
        graph.addEdge(4, 1);
        graph.addEdge(5, 7);
        graph.addEdge(5, 9);
        graph.addEdge(5, 2);

        Vertex bfs = new Vertex(graph, 0);
        assert bfs.hasPathTo(9);
        System.out.println("Кратчайший путь: "+ bfs.pathTo(9));
    }

    public static void main(String[] args) {
        findWay();
    }
}
