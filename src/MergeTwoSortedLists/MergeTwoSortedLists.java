package MergeTwoSortedLists;

/**
 * Admin 3/1/2026
 * Problem: Merge Two Sorted Lists
 * Difficulty: Easy
 * Link: <a href="https://leetcode.com/problems/merge-two-sorted-lists/">Click Me</a>
 **/
public class MergeTwoSortedLists {

    // ==============================
    // SOLUTION #1
    // ==============================
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        boolean isHeadNode = true;

        ListNode resNode = null;
        ListNode headNode = null;

        while (list1 != null && list2 != null) {

            int valFirst = list1.val;
            int valSecond = list2.val;

            if (valSecond <= valFirst) {
                resNode = appendNewNode(resNode, valSecond);
                list2 = list2.next;
            } else {
                resNode = appendNewNode(resNode, valFirst);
                list1 = list1.next;
            }

            if (isHeadNode) {
                headNode = resNode;
                isHeadNode = false;
            }

        }

        if (list1 != null) {
            if (resNode != null) resNode.next = list1;
            else return list1;
        } else if (list2 != null) {
            if (resNode != null) resNode.next = list2;
            else return list2;
        }

        return headNode;
    }

    public static ListNode appendNewNode(ListNode currentNode, int val) {

        ListNode newNode = new ListNode(val);

        if (currentNode == null) return newNode;

        currentNode.next = newNode;

        return newNode;
    }

    // ==============================
    // SOLUTION #2
    // ==============================
    public static ListNode mergeTwoLists_second(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;


        while (list1 != null && list2 != null) {

            int valFirst = list1.val;
            int valSecond = list2.val;

            if (valSecond <= valFirst) {
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }


            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }


    public static void main(String[] args) {

        // Test 1
//        ListNode list1 = new ListNode(1,
//                new ListNode(2,
//                        new ListNode(4)));
//
//        ListNode list2 = new ListNode(1,
//                new ListNode(3,
//                        new ListNode(4)));

        // Test 2
//        ListNode list1 = null;
//        ListNode list2 = null;

        // Test 3
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);


        ListNode result = mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

}
