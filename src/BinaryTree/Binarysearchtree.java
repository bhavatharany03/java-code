package BinaryTree;

public class Binarysearchtree {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public Node Binarytreeb(int[] arr,int start,int end) {
        if (start == end) {
            return new Node(arr[start]);
        }
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = Binarytreeb(arr, 0, mid - 1);
        root.right = Binarytreeb(arr, mid + 1,end);
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        Binarysearchtree tree = new Binarysearchtree();
        Node root = tree.Binarytreeb(arr,0,arr.length-1);
        if (root != null){
            System.out.println(root.left.data);
        }
        else{
            System.out.println("Tree is empty");
        }
    }
}
