package LeetCode.LinkedLists;


public class ReverseLinkedListII {
    static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;

        //skipping the first left-1 nodes
        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            previous = current;
            current = current.next;
        }
        ListNode last = previous;
        ListNode newEnd = current;

        //reversing between left and right
        ListNode next = current.next;
        for (int i = 0;current != null && i < right-left+1; i++) {
            current.next = previous;
            previous = current;
            current  = next;
            if(next != null) {
                next = next.next;
            }
        }
        if(last != null) {
            last.next = previous;
        } else {
            head = previous;
        }
        newEnd.next = current;
        return head;
    }

    // Utility function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Example usage
    public static void main(String[] args) {
        ReverseLinkedListII obj = new ReverseLinkedListII();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.println("Original list:");
        printList(head);

        // Reverse between position 2 and 4: Expected Output -> 1 -> 4 -> 3 -> 2 -> 5
        head = obj.reverseBetween(head, 2, 4);

        System.out.println("Reversed sublist:");
        printList(head);
    }
}