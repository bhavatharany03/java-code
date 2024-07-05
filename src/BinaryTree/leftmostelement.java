package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class leftmostelement {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printCorner(Node root) {
        {
            // star node is for keeping track of levels
            Queue<Node> q = new LinkedList<Node>();

            // pushing root node and star node
            q.add(root);
            // Do level order traversal of Binary Tree
            while (!q.isEmpty()) {
                // n is the no of nodes in current Level
                int n = q.size();
                for (int i = 0; i < n; i++) {
                    // dequeue the front node from the queue
                    Node temp = q.peek();
                    q.poll();
                    //If it is leftmost corner value or rightmost corner value then print it
                    if (i == 0 || i == n - 1)
                        System.out.print(temp.data + " ");
                    //push the left and right children of the temp node
                    if (temp.left != null)
                        q.add(temp.left);
                    if (temp.right != null)
                        q.add(temp.right);
                }
            }

        }
    }

        // Driver program to test above functions
        public static void main(String[] args){
            leftmostelement tree = new leftmostelement();
            Node root = new Node(15);
            root.left = new Node(10);
            root.right = new Node(20);
            root.left.left = new Node(8);
            root.left.right = new Node(12);
            root.right.left = new Node(16);
            root.right.right = new Node(25);

            printCorner(root);
        }
    }
