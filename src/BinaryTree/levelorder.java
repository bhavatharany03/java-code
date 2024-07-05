package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class levelorder {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void levelorder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node newnode = q.poll();
            System.out.print(newnode.data+ " ");
            if (newnode.left != null) {
                q.add(newnode.left);
            }
            if (newnode.right != null) {
                q.add(newnode.right);
            }
        }
    }
        public static void main(String args[]){
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right = new Node(7);
        levelorder(root);
    }
}
// Java program to print corner node at each level in a binary tree

//import java.util.*;

/* A binary tree node has key, pointer to left
child and a pointer to right child */
//class Node
//{
//    int key;
//    Node left, right;
//
//    public Node(int key)
//    {
//        this.key = key;
//        left = right = null;
//    }
//}
//
//class BinaryTree
//{
//    Node root;
//
//    /* Function to print corner node at each level */
//    void printCorner(Node root)
//    {
//        // star node is for keeping track of levels
//        Queue<Node> q = new LinkedList<Node>();
//
//        // pushing root node and star node
//        q.add(root);
//        // Do level order traversal of Binary Tree
//        while (!q.isEmpty())
//        {
//            // n is the no of nodes in current Level
//            int n = q.size();
//            for(int i = 0 ; i < n ; i++){
//                // dequeue the front node from the queue
//                Node temp = q.peek();
//                q.poll();
//                //If it is leftmost corner value or rightmost corner value then print it
//                if(i==0 || i==n-1)
//                    System.out.print(temp.key + " ");
//                //push the left and right children of the temp node
//                if (temp.left != null)
//                    q.add(temp.left);
//                if (temp.right != null)
//                    q.add(temp.right);
//            }
//        }
//
//    }
//
//    // Driver program to test above functions
//    public static void main(String[] args)
//    {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(15);
//        tree.root.left = new Node(10);
//        tree.root.right = new Node(20);
//        tree.root.left.left = new Node(8);
//        tree.root.left.right = new Node(12);
//        tree.root.right.left = new Node(16);
//        tree.root.right.right = new Node(25);
//
//        tree.printCorner(tree.root);
//    }
//}
//
//// This code has been contributed by Utkarsh Choubey
