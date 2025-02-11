package LeetCode.LinkedLists;

public class SortLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5)))));
        SortLinkedList obj = new SortLinkedList();
        ListNode sorted = obj.sortList(head);
        printList(sorted);
    }

    public ListNode sortList(ListNode head) {
        // Sorting logic to be implemented
        //merge sort
        if(head == null || head.next == null) {
            return head;
        }

        ListNode  slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode li = dummy;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                li.next = list1;
                list1 = list1.next;
                li = li.next;
            } else if (list1.val > list2.val) {
                li.next = list2;
                list2 = list2.next;
                li = li.next;
            } else {
                li.next = list1;
                list1 = list1.next;
                li = li.next;
                li.next = list2;
                list2 = list2.next;
                li = li.next;
            }
//            li = li.next;
        }
        while (list1 != null) {
            li.next = list1;
            list1 = list1.next;
            li = li.next;
        }
        while (list2 != null) {
            li.next = list2;
            list2 = list2.next;
            li = li.next;
        }
        return dummy.next;
    }


    static ListNode middleNode1(ListNode head) {
        ListNode  slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}