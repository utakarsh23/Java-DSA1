package LinkedLists.Questions;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class dd {

    static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node != null && node.next != null) {
            if(node.next.val == node.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}

