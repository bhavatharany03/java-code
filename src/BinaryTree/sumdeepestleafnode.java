package BinaryTree;


public class sumdeepestleafnode {

        static int sum = 0, max_level = Integer.MIN_VALUE;

        static class Node
        {
            int d;
            Node l;
            Node r;
        };


        static Node createNode(int d)
        {
            Node node;
            node = new Node();
            node.d = d;
            node.l = null;
            node.r = null;
            return node;
        }


        static void sumOfNodesAtMaxDepth(Node ro,int level)
        {
            if(ro == null)
                return;
            if(level > max_level)
            {
                sum = ro . d;
                max_level = level;
            }
            else if(level == max_level)
            {
                sum = sum + ro . d;
            }
            sumOfNodesAtMaxDepth(ro . l, level + 1);
            sumOfNodesAtMaxDepth(ro . r, level + 1);
        }

        public static void main(String[] args)
        {
            Node root;
            root = createNode(1);
            root.l = createNode(2);
            root.r = createNode(3);
            root.l.l = createNode(4);
            root.l.r = createNode(5);
            root.r.l = createNode(6);
            root.r.r = createNode(7);
            sumOfNodesAtMaxDepth(root, 0);
            System.out.println(sum);
        }
    }


