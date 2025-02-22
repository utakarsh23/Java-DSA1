package LeetCode.LinkedLists;


import java.util.HashSet;
import java.util.Set;

public class LinkedListIntersection {

    //method one, usinh extra space
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null)  return null;

        Set<ListNode> nodes = new HashSet<>();
        while (headA != null) {
            nodes.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if(nodes.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }

    //method 2, more efficient, no extra space
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int A = len(headA);
        int B = len(headB);
        int c = Math.abs(A-B);
        if(A > B) {
            for(int i = 0; i < c; i++) headA = headA.next;
        } else if (A < B) {
            for(int i = 0; i < c; i++) headB = headB.next;
        }
        while (headA != null && headB != null) {
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int len(ListNode node) {
        int c = 0;
        while (node != null) {
            c++;
            node = node.next;
        }
        return c;
    }

        public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);
        
        headA.next.next = intersect; // Connect A to intersection

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect; // Connect B to intersection

        LinkedListIntersection finder = new LinkedListIntersection();
        ListNode result = finder.getIntersectionNode1(headA, headB);
        
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}