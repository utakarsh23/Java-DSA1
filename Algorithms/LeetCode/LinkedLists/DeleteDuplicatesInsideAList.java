package LeetCode.LinkedLists;

public class DeleteDuplicatesInsideAList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.next.val == node.val) {
                node.next = node.next.next; // Remove duplicate
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Sample test case
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        
        DeleteDuplicatesInsideAList obj = new DeleteDuplicatesInsideAList();
        ListNode result = obj.deleteDuplicates(head);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}