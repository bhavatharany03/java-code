//package BinaryTree;
//
//public class isIdentical {
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
//    public static boolean issame(Node r1, Node r2) {
//        if (r1 == null && r2 == null) {
//            return true;
//        }
//        if (r1 == null || r2 == null) {
//            return false;
//        }
//        boolean b = (r1.data == r2.data) && issame(r1.left, r2.left) && issame(r2.left, r2.right);
//        return b;
//    }
//
//    public void main(String[] args) {
//        Node root1 = new Node(1);
//        root1.left = new Node(2);
//        root1.right = new Node(3);
//        root1.left.left = new Node(4);
//
//        Node root2 = new Node(1);
//        root2.left = new Node(2);
//        root2.right = new Node(3);
//        root2.right.right = new Node(4);
//        if (issame(root1, root2)) {
//            System.out.println("Identical");
//        } else {
//            System.out.println("not identical");

//}
//    }
//}
package BinaryTree;

public class isIdentical {
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

    // Method to check if two trees are identical
    public boolean issame(Node r1, Node r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null || r2 == null) {
            return false;
        }
        return (r1.data == r2.data) && issame(r1.left, r2.left) && issame(r1.right, r2.right);
    }

    // Static main method to run the program
    public static void main(String[] args) {
        isIdentical tree = new isIdentical(); // Create an instance of the outer class

        // Create nodes for the first tree using the outer class instance
        Node root1 = tree.new Node(1);
        root1.left = tree.new Node(2);
        root1.right = tree.new Node(3);
        root1.left.left = tree.new Node(4);

        // Create nodes for the second tree using the outer class instance
        Node root2 = tree.new Node(1);
        root2.left = tree.new Node(2);
        root2.right = tree.new Node(3);
        root2.right.right = tree.new Node(4);

        // Check if the trees are identical and print the result
        if (tree.issame(root1, root2)) {
            System.out.println("Identical");
        } else {
            System.out.println("Not identical");
        }
    }
}
