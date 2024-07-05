package BinaryTree;


public class Nodecount {
    static int count = 0;
    static int sum = 0;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    public static void Count(Node root) {
//        static int count;
//        count = 0;

        if (root == null) {
            return;
        }
        count++;
        sum = sum + root.data;
        Count(root.left);
        Count(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Count(root);
        System.out.println(count);
        System.out.print(sum);
    }
}
