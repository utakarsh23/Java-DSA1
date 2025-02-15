package LeetCode.LinkedLists;

public class SwapNodesInLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;

        SwapNodesInLinkedList obj = new SwapNodesInLinkedList();
        ListNode result = obj.swapNodes(head, k);

        System.out.print("Modified List: ");
        printList(result);
    }

    public ListNode swapNodes(ListNode head, int k) {
        // Implement your logic here
//        if(head == null || head.next == null) return head;
//            int size = 1;
//            ListNode dh = head;
//            while (dh.next != null) {
//                dh = dh.next;
//                size++;
//            }
//            int kInt = size-k;
//            ListNode node = head;
//            ListNode temp = head;
//        int vall =0;
//        for (int i = 0; i <= kInt; i++) {
//
//            if(i < k-1) {
//                temp = temp.next;
//                vall = temp.val;
//            }
//            if(i == kInt) {
//                temp.val = node.val;
//                node.val = vall;
//            }
//
//            node = node.next;
//        }
        return head;
    }

    public ListNode swapNodes1(ListNode head, int k) {
        ListNode temp=head;
        ListNode cur=head;
        while(k>1){
            temp=temp.next;
            k--;
        }
        ListNode prev=temp;
        int val=temp.val;
        while(temp.next!=null){
            temp=temp.next;
            cur=cur.next;
        }
        prev.val=cur.val;
        cur.val=val;
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