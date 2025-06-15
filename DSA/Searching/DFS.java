import java.util.*;

public class DFS {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    // Constructor
    public DFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // DFS starting from a given vertex
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(startVertex, visited);
    }

    // Helper method for DFS (recursive)
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("DFS starting from vertex 0:");
        graph.DFS(0);
    }
}
