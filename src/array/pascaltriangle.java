package array;


import java.util.*;
import java.util.List;

public class pascaltriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
        public static List<List<Integer>> generate(int numRows) {
            // Step 1: Create a list to hold the rows of the triangle
            List<List<Integer>> triangle = new ArrayList<List<Integer>>();

            // Step 2: If numRows is less than or equal to 0, return the empty list
            if (numRows <= 0) {
                return triangle;
            }

            // Step 3: Loop through each row from 0 to numRows - 1
            for (int i = 0; i < numRows; i++) {
                // Step 4: Create a new list to hold the current row
                List<Integer> row = new ArrayList<Integer>();

                // Step 5: Loop through each element in the current row
                for (int j = 0; j < i + 1; j++) {
                    // Step 6: If the element is the first or last in the row, add 1
                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {
                        // Step 7: Otherwise, add the sum of the two elements directly above it
                        row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                    }
                }

                // Step 8: Add the current row to the triangle
                triangle.add(row);
            }

            // Step 9: Return the triangle
            return triangle;
        }
    }
