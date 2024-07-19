package jp_questions;

import java.util.*;

public class reachability {
    public static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest) {
        if (src == dest) {
            return true;
        }
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited.add(src);
        while (!q.isEmpty()) {
            int node = q.poll();
            List<Integer> neighbor = adj.get(node);
            for (int i : neighbor) {
                if (i == dest) {
                    return true;
                }
                if (!visited.contains(neighbor)) {
                    q.add(i);
                    visited.add(i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(1).add(0);
        adj.get(2).add(0);
        adj.get(3).add(0);
        boolean ans = bfs(adj, 0, 2);
        System.out.print(ans);
    }
}

