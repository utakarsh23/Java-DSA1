package LeetCode.LinkedLists;

class oddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode headA = new ListNode(0);
        ListNode headfa = headA;
        ListNode headB = new ListNode(0);
        ListNode headfb = headB;

        while (head != null) {
            headfa.next = head;
            headfa = headfa.next;
            head = head.next;
            if(head == null) break;

            headfb.next = head;
            headfb = headfb.next;
            head = head.next;
        }
        headfb.next = null;
        headfa.next = headB.next;
        return headA.next;
    }

    // Helper function to print the linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        oddEvenLinkedList solution = new oddEvenLinkedList();

        // Create a test linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.println("Original List:");
        solution.printList(head);

        // Apply the oddEvenList function
        ListNode result = solution.oddEvenList(head);

        System.out.println("Reordered List:");
        solution.printList(result);
    }
}