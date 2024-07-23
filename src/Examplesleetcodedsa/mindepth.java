package Examplesleetcodedsa;

import java.util.LinkedList;
import java.util.Queue;

public class mindepth{
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
             this.left = left;
            this.right = right;
         }
      }
        public static int minDepth(TreeNode root) {
            if(root==null){
                return 0;
            }


            int depth=1;
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            q.offer(root);

            while(!q.isEmpty()){
                int size = q.size();
                for(int i=0;i<size;i++){
                    TreeNode node = q.poll();


                    if(node.left==null && node.right==null){
                        return depth;
                    }

                    if(node.left!=null){
                        q.offer(node.left);
                    }

                    if(node.right!=null){
                        q.offer(node.right);
                    }
                }
                depth++;
            }
            return depth;
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(5);
            root.left = new TreeNode(4);
            root.right = new TreeNode(8);
            root.left.left = new TreeNode(11);
            root.left.left.right = new TreeNode(7);
            root.left.left.right.right = new TreeNode(1);
            root.right.left = new TreeNode(13);
            root.right.right = new TreeNode(4);
            root.right.right.right = new TreeNode(1);
            System.out.print(minDepth(root));


        }
    }

