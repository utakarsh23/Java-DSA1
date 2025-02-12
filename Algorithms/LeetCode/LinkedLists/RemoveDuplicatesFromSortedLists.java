package LeetCode.LinkedLists;


public class RemoveDuplicatesFromSortedLists {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));

        RemoveDuplicatesFromSortedLists obj = new RemoveDuplicatesFromSortedLists();
        ListNode resultHead = obj.deleteDuplicates1(head); // Implement this method yourself

        printList(resultHead);
    }

    public ListNode deleteDuplicates(ListNode head) { //does not handle edge cases such as duplicates at starting
        ListNode node = head.next;
        ListNode prev = head;
        while (node != null && node.next != null) {
            if (node.next.val == node.val) {
                while (node.next.val == node.val) {
                    node.next = node.next.next; // Remove duplicate
                }
                prev.next  = node.next;
                node = node.next;
            } else {
                prev = prev.next;
                node = node.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode res = new ListNode(0,head);
        ListNode prev = res;

        while(head != null && head.next != null){
            if(head.next.val == head.val){
                while(head.next != null && head.next.val == head.val){
                    head = head.next;
                }
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return res.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
