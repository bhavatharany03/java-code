package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Breadthfirstsearch {
    public static ArrayList<Integer> bfsofGraph(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            for(int it: adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<5;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        ArrayList<Integer> ans = bfsofGraph(5,adj);
        int n = ans.size();
        for (int i = 0; i<n; i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
