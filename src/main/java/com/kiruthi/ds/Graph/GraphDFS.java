package com.kiruthi.ds.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphDFS {

    // A function used by DFS
    void DFSUtil(int v, boolean visited[], Graph g) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = g.adjListArray[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited, g);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(Graph g) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[g.V];

        // Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
        for (int i = 0; i < g.V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited, g);
    }

    // Driver program to test above functions
    public static void main(String args[]) {
        // create the graph given in above figure
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 4);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 1, 3);
        graph.addEdge(graph, 1, 4);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 4);

        // print the adjacency list representation of
        // the above graph
        new GraphDFS().DFS(graph);
    }
}
