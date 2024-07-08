package greedyapproach;

import java.util.ArrayList;

public class maximumactivities {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        int maxAct = 1;
        ArrayList<Integer> l1 = new ArrayList<>();
        int lastend = end[0];
        l1.add(0);
        for(int i=0;i<end.length;i++) {
            if (start[i] >= lastend) {
                maxAct++;
                l1.add(1);
                lastend = end[i];
            }
        }
            System.out.println("max activities:"+maxAct);
            for(int i=0;i< l1.size();i++){
                System.out.println("A"+l1.get(i)+" ");
            }
            System.out.println();

        }



    }
