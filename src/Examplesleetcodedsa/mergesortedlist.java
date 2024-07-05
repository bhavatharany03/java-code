package Examplesleetcodedsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergesortedlist {
    public static List<Integer> merge(List<Integer> l1, List<Integer> l2) {
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                res.add(l1.get(i));
                i++;
            } else {
                res.add(l2.get(j));
                j++;
            }
        }

        while (i < l1.size()) {
            res.add(l1.get(i));
            i++;
        }

        while (j < l2.size()) {
            res.add(l2.get(j));
            j++;
        }

        return res;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 4));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 3, 4));
        List<Integer> l3 = merge(l1, l2);
        System.out.println(l3);
    }
}
