package LeetCode.LinkedLists;

public class PalindromeLinkedList {

    //method 1
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode1(head);
        ListNode headSecond = reverseList3(mid);

        //comparing both halves
        while (head != null && headSecond != null) {
            if(head.val != headSecond.val) {
                return false;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        return true;
    }

    //m3 kk's imp
    public boolean isPalindrome2(ListNode head) {
        ListNode mid = middleNode1(head);
        ListNode headSecond = reverseList3(mid);
        ListNode reReverseHead = headSecond;

        //comparing both halves
        while (head != null && headSecond != null) {
            if(head.val != headSecond.val) {
                return false;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList3(reReverseHead);
        if(head == null || headSecond == null) {
            return true;
        }
        return false;
    }


    public ListNode reverseList3(ListNode head) {
        // Implement your logic here
        if (head == null || head.next == null) return head;
        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = previous;
            previous = present;
            present  = next;
            if(next != null) {
                next = next.next;
            }
        }
        return previous;
    }


    public ListNode middleNode1(ListNode head) {
        ListNode  slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //method 2
    public boolean isPalindrome1(ListNode head) {
        int[] arr = new int[100000];
        if(head == null || head.next == null) return true;
        int i = 0;
        ListNode temp = head;
        while (temp != null) {
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        i--;
        int j = 0;
        int t = i;
        while (j <= t/2){
            if(arr[j] != arr[i]) {
                return false;
            }
            j++;
            i--;
        }
        return true;
    }


    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(3, new ListNode(4, new ListNode(0, new ListNode(1))))));

        System.out.print("Linked List: ");
        printList(head);

        PalindromeLinkedList solution = new PalindromeLinkedList();
        System.out.println("Is Palindrome? " + solution.isPalindrome2(head));
    }
}