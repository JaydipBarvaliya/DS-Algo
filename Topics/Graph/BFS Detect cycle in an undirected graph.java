import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int node;
    int parent;
    public Pair(int node, int parent){
        this.node = node;
        this.parent = parent;
    }
}

class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++){

            if(visited[i] == false){
                if(detectCycle(i, adj, visited)) return true;    
            }

        }
        return false;      
    }


    public static boolean detectCycle(int src, ArrayList<ArrayList<Integer>> adj, boolean[] visited){

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(src, -1));
        visited[src] = true;

        while(!queue.isEmpty()){

            int node = queue.peek().node;
            int parent = queue.peek().parent;
            queue.remove();

            for (int neigh : adj.get(node)) {

                if(visited[neigh] == false){
                    visited[neigh] = true;
                    queue.add(new Pair(neigh, node));
                }else if (neigh != parent){
                    return true;
                }
            }
        }
        return false;
    }
}