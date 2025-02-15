package LeetCode.LinkedLists;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        int n = 4;

        RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();
        ListNode result = obj.removeNthFromEnd(head, n);

        System.out.print("Modified List: ");
        printList(result);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Implement your logic here
        if(head == null || head.next == null)  return head;
        ListNode temp = head;
        ListNode node = head;
        while (n > 1) {
            temp = temp.next;
            n--;
        }
        ListNode prev = temp;
        if(temp.next != null) {
            temp = temp.next;
        } else {
            head = head.next;
            return head;
        }
        while (temp.next != null) {
            temp = temp.next;
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
}