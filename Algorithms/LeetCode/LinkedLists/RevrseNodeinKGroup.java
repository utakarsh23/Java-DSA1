package LeetCode.LinkedLists;


public class RevrseNodeinKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null) {
            return head;
        }
        //skipping the first left-1 nodes
        ListNode current = head;
        ListNode previous = null;
        while (true) {
            ListNode last = previous;
            ListNode newEnd = current;

            //reversing between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = previous;
                previous = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = previous;
            } else {
                head = previous;
            }
            newEnd.next = current;
            if(current == null) break;
            previous = newEnd;
        }
        return head;
    }

    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.print("Original List: ");
        printList(head);

        RevrseNodeinKGroup solution = new RevrseNodeinKGroup();
        int k = 2; // Change this to test different values of k
        head = solution.reverseKGroup(head, k);

        System.out.print("Reversed in groups of " + k + ": ");
        printList(head);
    }
}