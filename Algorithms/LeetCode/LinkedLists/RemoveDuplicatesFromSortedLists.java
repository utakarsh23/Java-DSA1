package LeetCode.LinkedLists;


public class RemoveDuplicatesFromSortedLists {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));

        RemoveDuplicatesFromSortedLists obj = new RemoveDuplicatesFromSortedLists();
        ListNode resultHead = obj.deleteDuplicates(head); // Implement this method yourself

        printList(resultHead);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head.next;
        ListNode prev = head;
        while (node != null && node.next != null) {
            if(node.val == node.next.val) {
                while (node.val == node.next.val) {
                    node.next = node.next.next;
                }
            } else {
                node = node.next;
                prev.next = node.next;
            }


        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
