package LinkedLists.Questions;

public class Main {
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a test linked list: 1 -> 1 -> 2 -> 3 -> 3 -> null
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));

        System.out.println("Before removing duplicates:");
        printList(head);

        // Calling the deleteDuplicates method
        dd solution = new dd();
        head = solution.deleteDuplicates(head);

        System.out.println("After removing duplicates:");
        printList(head);
    }
}
