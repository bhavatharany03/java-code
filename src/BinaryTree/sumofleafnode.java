//package BinaryTree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class sumofleafnode {
//    public class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    public static int deepestleaves(Node root) {
//        if (root == null)
//            return 0;
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        int sum = 0;
//        while (!q.isEmpty()) {
//            int size = q.size();
//            sum = 0;
//            for (int i = 0; i < size; i++) {
//                Node cur = q.poll();
//                sum += cur.data;
//                if (cur.left != null) {
//                    q.add(cur.left);
//                }
//                if (cur.right != null) {
//                    q.add(cur.right);
//                }
//            }
//        }
//        return sum;
//    }
//
//    public void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.right.left = new Node(10);
//        root.right.right = new Node(6);
//        root.left.left.left = new Node(7);
//        root.right.right.right = new Node(8);
//        int ans = deepestleaves(root);
//        System.out.println(ans);
//    }
//}
package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class sumofleafnode {
    // Inner class for tree nodes
    public class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to calculate the sum of the deepest leaves
    public int deepestleaves(Node root) {
        if (root == null) {
            return 0; // Should return 0 instead of void when the tree is empty
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            sum = 0; // Reset sum for the current level
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                sum += cur.data;
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        return sum; // Return the sum of the deepest leaves
    }

    // Static main method to run the program
    public static void main(String[] args) {
        sumofleafnode tree = new sumofleafnode(); // Create an instance of the outer class


        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.right.left = tree.new Node(10);
        root.right.right = tree.new Node(6);
        root.left.left.left = tree.new Node(7);
        root.right.right.right = tree.new Node(8);

        int ans = tree.deepestleaves(root);
        System.out.println(ans);
    }
}
