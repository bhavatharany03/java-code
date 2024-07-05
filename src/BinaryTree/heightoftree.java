package BinaryTree;

public class heightoftree {
        // Definition of the Node class
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


        public static int height(Node root) {
            if (root == null) {
                return -1;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return 1 + Math.max(leftHeight, rightHeight);
        }

        public static void main(String[] args) {

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            int treeHeight = height(root);
            System.out.println("Height of the tree: " + treeHeight);
        }
    }
