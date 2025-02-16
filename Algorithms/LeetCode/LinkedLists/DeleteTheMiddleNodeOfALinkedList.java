package LeetCode.LinkedLists;

class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // Method to print the linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteTheMiddleNodeOfALinkedList solution = new DeleteTheMiddleNodeOfALinkedList();

        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        solution.printList(head);

        head = solution.deleteMiddle(head);

        System.out.println("List after deleting middle node:");
        solution.printList(head);
    }
}