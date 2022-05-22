import java.io.*;
import java.util.*;
import java.util.LinkedList;

class BuildGraph{

    // Tracks which nodes are connected
    public LinkedList<Integer> adj[];

    //Constructor
    BuildGraph(int v)
    {
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //we are adding u in the list of v and vice versa because graph is un-directed
    //used to Building graph by adding edges between two nodes
    void addEdge(int u, int z){
        adj[z].add(u);
        adj[u].add(z);
    }

    void ColorGraph(int V){
        // Stores color of the vertexes
        int ans[] = new int[V];

        // Lists color of each node
        for(int i=0; i<V;i++)
            ans[i]=-1;

        // First vertex is color 0
        ans[0]=0;

        // Checks color availability
        boolean totalColors[] = new boolean[V];
        for(int i=0; i<V; i++)
            totalColors[i]=true;

        for(int u=1; u<V; u++){
            // Traverses nodes adjacent to node u
            Iterator<Integer> itr = adj[u].iterator();
            while(itr.hasNext()){
                int x = itr.next();
                if(ans[x] != -1){
                    totalColors[ans[x]] = false;
                }
            }

            // Assigns u the first color available
            int color;
            for(color=0; color<V; color++){
                if(totalColors[color]==true)
                    break;
            }
            ans[u] = color;
            // New iteration
            for(int i=0; i<V; i++)
                totalColors[i]=true;
        }

        System.out.println("Vertex\tColor");
        for(int u=0; u<V; u++){
            System.out.println(u +"\t"+ans[u]);
        }
    }

    public static void main(String args[]){
        int V=6, E=8;
        BuildGraph g = new BuildGraph(V);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(0,5);
        g.addEdge(4,5);
        g.addEdge(1,4);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(2,4);

        System.out.println("Coloring of the graph is: ");
        g.ColorGraph(V);
    }
}