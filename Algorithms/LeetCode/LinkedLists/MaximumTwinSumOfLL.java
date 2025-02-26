package LeetCode.LinkedLists;

class MaximumTwinSumOfLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println("Max Twin Sum: " + pairSum(head));
    }

    public static int pairSum(ListNode head) {
        ListNode firstHalf = new ListNode(0);
        ListNode fh = firstHalf;
        ListNode dh = head;
        ListNode node = head;
        while (node != null && node.next != null) {
            node = node.next.next;
            fh.next = dh;
            fh = fh.next;
            dh = dh.next;
        }
        fh.next = null;
        firstHalf = firstHalf.next;
        int max = Integer.MIN_VALUE;
        while(fh != null) {
            head = head.next
            fh = fh.next;
        }

    }
    static ListNode middleNode1(ListNode head) {
        ListNode  slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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