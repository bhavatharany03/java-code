package jp_questions;

import java.util.*;

public class nearestmeetingpoint {
        public static int minimumWeight(int n, int[] edges, int C1, int C2) {

            List<List<Integer>> graph = new ArrayList<>();
            for(int i=0;i<n;i++){
                graph.add(new ArrayList<Integer>());
            }
            for(int i=0;i<n;i++){
                if(edges[i]!=-1){
                    graph.get(i).add(edges[i]);
                }
            }

            long[] A = new long[n];
            long[] B = new long[n];
            Arrays.fill(A,Long.MAX_VALUE);
            Arrays.fill(B,Long.MAX_VALUE);

            dijkstra(C1,graph,A);
            dijkstra(C2,graph,B);

            int node=0;
            long dist=Long.MAX_VALUE;
            for(int i=0;i<n;i++){

                if(A[i]==Long.MAX_VALUE || B[i]==Long.MAX_VALUE) continue;

                if(dist>A[i]+B[i]){
                    dist= A[i]+B[i];
                    node=i;
                }
            }
            if(dist==Long.MAX_VALUE) return -1;
            return node;
        }

        private static void dijkstra(int start, List<List<Integer>> graph, long[] distances){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(start);
            distances[start]=0;
            while(!pq.isEmpty()){
                int curr = pq.poll();
                for(int neighbor : graph.get(curr)){
                    long distance = distances[curr]+1;
                    if(distance<distances[neighbor]){
                        distances[neighbor]=distance;
                        pq.offer(neighbor);
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] edges = new int[n];
            for(int i=0;i<n;i++){
                edges[i] = scanner.nextInt();
            }
            int C1 = scanner.nextInt();
            int C2 = scanner.nextInt();
            System.out.println(minimumWeight(n,edges,C1,C2));
        }

    }
