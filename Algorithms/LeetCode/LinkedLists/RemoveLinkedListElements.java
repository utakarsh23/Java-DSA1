package LeetCode.LinkedLists;

class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode prev = null;
        ListNode node = head;
        while (node != null) {
            if(node.val == val) {
                    prev.next = node.next;
            } else {
                prev = node;
            }
            node = node.next;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        int n = 7;

        RemoveLinkedListElements obj = new RemoveLinkedListElements();
        ListNode result = obj.removeElements(head, n);

        System.out.print("Modified List: ");
        printList(result);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}