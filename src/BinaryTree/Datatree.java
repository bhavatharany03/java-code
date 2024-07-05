package BinaryTree;

import java.util.Stack;

public class Datatree {
        public static int changes(String[] ops, int i, Stack<Integer> s) {
            if (i == ops.length) {
                int sum = 0;
                for (int num : s) {
                    sum += num;
                }
                return sum;
            }

            String op = ops[i];
            if (op.equals("D")) {
                int last = s.peek();
                s.push(last * 2);
            } else if (op.equals("C")) {
                s.pop();
            } else if (op.equals("+")) {
                int last = s.pop();
                int secondLast = s.peek();
                s.push(last);
                s.push(last + secondLast);
            } else {
                s.push(Integer.parseInt(op));
            }

            return changes(ops, i + 1, s);
        }

        public static void main(String args[]) {
            Stack<Integer> s = new Stack<>();
            String[] ops = {"5", "2", "C", "D", "+"};
            int result = changes(ops, 0, s);
            System.out.println(result);
        }
    }