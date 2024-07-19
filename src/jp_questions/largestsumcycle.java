package jp_questions;

public class largestsumcycle {
        long largestsum=-1;
        public long largesSumCycle(int N, int Edge[]){

            boolean[] nodeVisited = new boolean[N];
            boolean[] pathVisited = new boolean[N];
            // int sum=0;
            for(int i=0;i<N;i++){
                if(!nodeVisited[i]){
                    dfs(i,Edge,nodeVisited,pathVisited);
                }
            }
            return largestsum;

        }
        public void dfs(int i,int[] Edge,boolean[] nodeVisited,boolean[] pathVisited){
            nodeVisited[i]=true;
            pathVisited[i]=true;
            if(Edge[i]!=-1){
                int adj = Edge[i];
                if(!nodeVisited[adj]){
                    dfs(adj,Edge,nodeVisited,pathVisited);
                }else if(pathVisited[adj]){
                    int current = adj;
                    long sum=0;
                    do{
                        sum = sum +current;
                        current = Edge[current];
                    }while(current!=adj);
                    largestsum = Math.max(largestsum,sum);
                }
            }
            pathVisited[i]=false;
        }
    }

