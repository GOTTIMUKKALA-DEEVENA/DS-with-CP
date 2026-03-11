import java.util.LinkedList;

class Graph {

    int V; // vertices
    LinkedList<Integer> adj[]; // adjacency list

    Graph(int v) {
        this.V = v;

        adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {

        boolean visited[] = new boolean[V];

        LinkedList<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {

            s = q.poll();
            System.out.print(s + " ");

            for (int i = 0; i < adj[s].size(); i++) {

                int node = adj[s].get(i);

                if (!visited[node]) {
                    visited[node] = true;
                    q.add(node);
                }
            }
        }
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {

            System.out.print(i + " -> ");

            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }

            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("Try programiz.pro");

        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.printGraph();

        System.out.print("BFS Traversal: ");
        g.BFS(0);
    }
}
