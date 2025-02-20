package LeetCode.LinkedLists;

public class PartitionList {
    public ListNode partition(ListNode cur, int x) {
        ListNode leftf = new ListNode(0);
        ListNode left = leftf;
        ListNode rightf = new ListNode(0);
        ListNode right = rightf;

        while (cur!= null) {
            if(cur.val < x) {
                left.next = cur;
                left = left.next;
            } else{
                right.next = cur;
                right = right.next;
            }
            cur = cur.next;
        }
        right.next = null;
        left.next = rightf.next;
        return leftf.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        PartitionList obj = new PartitionList();
        ListNode newHead = obj.partition(head, 3);
        printList(newHead);
    }
}