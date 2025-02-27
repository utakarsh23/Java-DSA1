package LeetCode.LinkedLists;

import java.util.ArrayList;
import java.util.List;

class MaximumTwinSumOfLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));
        System.out.println("Max Twin Sum: " + pairSum1(head));
    }


    //m1
    public static int pairSum(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = reverse(slow);
        ListNode curr1 = head;
        int max = Integer.MIN_VALUE;
        while (head1 != null) {
            int vals = curr1.val + head1.val;
            max = Math.max(max, vals);
            head1 = head1.next;
            curr1 = curr1.next;
        }
        return max;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextnode;
        while(curr!=null){
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;

        }
        return prev;
    }

    //m2
    public static int pairSum1(ListNode head) {
        List<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            li.add(temp.val);
            temp = temp.next;
        }
        int i = 0;
        int j = li.size()-1;
        int max = Integer.MIN_VALUE;
        while(i < j) {
            max = Math.max(max, li.get(i)+li.get(j));
            i++;
            j--;
        }
        return max;
    }
}
