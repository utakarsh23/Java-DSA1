package LeetCode.LinkedLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class DeleteNodesFromLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> li = new HashSet<>();
        for (int x : nums) {
            li.add(x);
        }

        while (head != null && li.contains(head.val)) {
            head = head.next;
        }

        ListNode prev = null;
        ListNode node = head;
        while (node != null) {
            if (li.contains(node.val)) {
                prev.next = node.next;
            } else {
                prev = node;
            }
            node = node.next;
        }
        return head;
    }

    // Helper method to create a linked list from an array
    public ListNode createList(int[] nums) {
        if (nums.length == 0) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print a linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteNodesFromLinkedListPresentInArray sol = new DeleteNodesFromLinkedListPresentInArray();

        // Test case
        int[] nums = {1, 3, 5}; // Values to remove
        int[] listValues = {1, 2, 3, 4, 5, 6}; // Linked list values
        ListNode head = sol.createList(listValues);

        System.out.println("Original list:");
        sol.printList(head);

        head = sol.modifiedList(nums, head);

        System.out.println("Modified list:");
        sol.printList(head);
    }
}