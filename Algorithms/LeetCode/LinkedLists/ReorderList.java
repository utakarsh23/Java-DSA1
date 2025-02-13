package LeetCode.LinkedLists;


public class ReorderList {
    public void reorderList(ListNode head) {
        // Implement your solution here

        if(head == null || head.next == null)  return;
        ListNode mid = middleNode1(head);
        ListNode headSec = reverseList3(mid);
        ListNode headFirst = head;


        while (headFirst != null && headSec != null) {
            ListNode temp = headFirst.next;
            headFirst.next = headSec;
            headFirst = temp;

            temp = headSec.next;
            headSec.next = headFirst;
            headSec = temp;
        }
        //next of tail to null
        if(headFirst != null) {
            headFirst.next = null;
        }
    }

    public ListNode middleNode1(ListNode head) {
        ListNode  slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseList3(ListNode head) {
        // Implement your logic here
        if (head == null || head.next == null) return head;
        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = previous;
            previous = present;
            present  = next;
            if(next != null) {
                next = next.next;
            }
        }
        return previous;
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

        ReorderList solution = new ReorderList();
        solution.reorderList(head);

        System.out.print("Reordered List: ");
        printList(head);
    }
}