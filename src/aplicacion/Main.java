package aplicacion;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.TYPE;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.jwetherell.algorithms.graph.*;

public class Main {

    public static void main(String[] args) {
        // Unirected
        UndirectedGraph g = new UndirectedGraph();
        AStar<Integer> aStar = new AStar<Integer>();
        List<Graph.Edge<Integer>> path = aStar.aStar(g.graph, g.v1, g.v9);

        int initialNode = g.v1.getValue();
        int finalNode = g.v9.getValue();
        System.out.println("UNDIRECTED GRAPH: Optimal path from vertex " + initialNode + " to " + finalNode + ":");
        for (Graph.Edge<Integer> edge : path) {
            System.out.println(edge);
        }

        // Directed
        DirectedGraph g2 = new DirectedGraph();
        AStar<Integer> aStar2 = new AStar<Integer>();
        List<Graph.Edge<Integer>> path2 = aStar2.aStar(g2.graph, g2.v1, g2.v9);

        int initialNode2 = g2.v1.getValue();
        int finalNode2 = g2.v9.getValue();
        System.out.println("DIRECTED GRAPH: Optimal path from vertex " + initialNode2 + " to " + finalNode2 + ":");
        for (Graph.Edge<Integer> edge : path2) {
            System.out.println(edge);
        }
    }

    // Undirected
    private static class UndirectedGraph {
        final List<Vertex<Integer>> verticies = new ArrayList<Vertex<Integer>>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<Integer>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<Integer>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<Integer>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<Integer>(4);
        final Graph.Vertex<Integer> v5 = new Graph.Vertex<Integer>(5);
        final Graph.Vertex<Integer> v6 = new Graph.Vertex<Integer>(6);
        final Graph.Vertex<Integer> v7 = new Graph.Vertex<Integer>(7);
        final Graph.Vertex<Integer> v8 = new Graph.Vertex<Integer>(8);
        final Graph.Vertex<Integer> v9 = new Graph.Vertex<Integer>(9);
        final Graph.Vertex<Integer> v10 = new Graph.Vertex<Integer>(10);
        
        {
            verticies.add(v1);
            verticies.add(v2);
            verticies.add(v3);
            verticies.add(v4);
            verticies.add(v5);
            verticies.add(v6);
            verticies.add(v7);
            verticies.add(v8);
            verticies.add(v9);
            verticies.add(v10);
        }

        final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>();
        final Graph.Edge<Integer> e1_2 = new Graph.Edge<Integer>(1, v1, v2);
        final Graph.Edge<Integer> e1_4 = new Graph.Edge<Integer>(9, v1, v4);
        final Graph.Edge<Integer> e2_9 = new Graph.Edge<Integer>(15, v2, v9);
        final Graph.Edge<Integer> e3_4 = new Graph.Edge<Integer>(2, v3, v4);
        final Graph.Edge<Integer> e3_5 = new Graph.Edge<Integer>(10, v3, v5);
        final Graph.Edge<Integer> e3_6 = new Graph.Edge<Integer>(1, v3, v6);
        final Graph.Edge<Integer> e3_7 = new Graph.Edge<Integer>(5, v3, v7);
        final Graph.Edge<Integer> e6_9 = new Graph.Edge<Integer>(7, v6, v9);
        final Graph.Edge<Integer> e7_8 = new Graph.Edge<Integer>(4, v7, v8);
        final Graph.Edge<Integer> e7_10 = new Graph.Edge<Integer>(3, v7, v10);
        {
            edges.add(e1_2);
            edges.add(e1_4);
            edges.add(e2_9);
            edges.add(e3_4);
            edges.add(e3_5);
            edges.add(e3_6);
            edges.add(e3_7);
            edges.add(e6_9);
            edges.add(e7_8);
            edges.add(e7_10);
        }

        final Graph<Integer> graph = new Graph<Integer>(verticies, edges);
    }

    // Directed
    private static class DirectedGraph {
        final List<Vertex<Integer>> verticies = new ArrayList<Vertex<Integer>>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<Integer>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<Integer>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<Integer>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<Integer>(4);
        final Graph.Vertex<Integer> v5 = new Graph.Vertex<Integer>(5);
        final Graph.Vertex<Integer> v6 = new Graph.Vertex<Integer>(6);
        final Graph.Vertex<Integer> v7 = new Graph.Vertex<Integer>(7);
        final Graph.Vertex<Integer> v8 = new Graph.Vertex<Integer>(8);
        final Graph.Vertex<Integer> v9 = new Graph.Vertex<Integer>(9);
        final Graph.Vertex<Integer> v10 = new Graph.Vertex<Integer>(10);
        {
            verticies.add(v1);
            verticies.add(v2);
            verticies.add(v3);
            verticies.add(v4);
            verticies.add(v5);
            verticies.add(v6);
            verticies.add(v7);
            verticies.add(v8);
            verticies.add(v9);
            verticies.add(v10);
        }

        final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>();
        final Graph.Edge<Integer> e1_2 = new Graph.Edge<Integer>(1, v1, v2);
        final Graph.Edge<Integer> e1_3 = new Graph.Edge<Integer>(2, v1, v3);
        final Graph.Edge<Integer> e1_4 = new Graph.Edge<Integer>(3, v1, v4);
        final Graph.Edge<Integer> e2_5 = new Graph.Edge<Integer>(10, v2, v5);
        final Graph.Edge<Integer> e3_5 = new Graph.Edge<Integer>(4, v3, v5);
        final Graph.Edge<Integer> e3_6 = new Graph.Edge<Integer>(1, v3, v6);
        final Graph.Edge<Integer> e3_8 = new Graph.Edge<Integer>(20, v3, v8);
        final Graph.Edge<Integer> e5_6 = new Graph.Edge<Integer>(5, v5, v6);
        final Graph.Edge<Integer> e8_7 = new Graph.Edge<Integer>(7, v8, v7);
        final Graph.Edge<Integer> e8_9 = new Graph.Edge<Integer>(6, v8, v9);
        final Graph.Edge<Integer> e7_10 = new Graph.Edge<Integer>(17, v7, v10);

        {
            edges.add(e1_2);
            edges.add(e1_3);
            edges.add(e1_4);
            edges.add(e2_5);
            edges.add(e3_5);
            edges.add(e3_6);
            edges.add(e3_8);
            edges.add(e5_6);
            edges.add(e8_7);
            edges.add(e8_9);
            edges.add(e7_10);
        
        }

        final Graph<Integer> graph = new Graph<Integer>(Graph.TYPE.DIRECTED, verticies, edges);
    }
}
