package LeetCode.LinkedLists;

public class LinkedListCycle {
    
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    public static void main(String[] args) {
        LinkedListCycle solution = new LinkedListCycle();

        // Test Case 1: Cycle exists
        ListNode head1 = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head1.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle

        System.out.println("Cycle exists (expected true): " + solution.hasCycle(head1));

        // Test Case 2: No cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        System.out.println("Cycle exists (expected false): " + solution.hasCycle(head2));
    }
}