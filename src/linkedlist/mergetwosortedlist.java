//package linkedlist;
//import java.util.LinkedList;
//import java.util.List;
//
//public class mergetwosortedlist {
//    static int i=0;int j=0;
//    public class ListNode {
//        public int size;
//        int val;
//      ListNode next;
//      ListNode(int val, ListNode next) {
//          this.val = val;
//          this.next = next;
//      }
//  }
//        public static List<Integer> mergeTwoLists(ListNode list1, ListNode list2) {
//            List<Integer> res = new LinkedList<>();
//            for(i=0;i<list1.size();i++) {
//                for (int j = 0; j < list2.size(); j++) {
//                    if (list1[i] < list2[i]) {
//                        res.add(list1[i]);
//                    }
//                }
//                if (list2[i] <= list1[i]) {
//                    res.add(list2[i]);
//                }
//            }
//            return res;
//
//        }
//
//    public static void main(String[] args) {
//        List<Integer> list1 = new LinkedList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(4);
//        List<Integer> list2 = new LinkedList<>();
//        list2.add(1);
//        list1.add(3);
//        list1.add(4);
//
//        System.out.print(mergeTwoLists(list1,list2));
//
//
//    }
//}
