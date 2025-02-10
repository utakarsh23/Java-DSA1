package LeetCode.LinkedLists;

import java.util.List;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        MiddleOfLinkedList obj = new MiddleOfLinkedList();
        ListNode middle = obj.middleNode1(head);
        System.out.println("Middle Node: " + (middle != null ? middle.val : "null"));
    }

    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode dummyHead = head;
        while(dummyHead != null) {
            dummyHead = dummyHead.next;
            count++;
        }
        dummyHead = head;
        if(count%2 == 1) {
            count /=2;
//            count++;
        } else {
            count /= 2;
        }
        for(int i = 0; i < count; i++) {
            dummyHead = dummyHead.next;
        }
        return dummyHead;
    }
    //method two, slow and fast pointers
    static ListNode middleNode1(ListNode head) {
        ListNode  slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
