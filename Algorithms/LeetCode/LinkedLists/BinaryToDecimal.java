package LeetCode.LinkedLists;

public class BinaryToDecimal {
    
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node.next != null) {
            node = node.next;
            count++;
        }

        int sum = 0;
        node = head;
        while (node != null) {
            int temp = node.val;
            sum = sum + (int)Math.pow(2, count)*temp;
            node = node.next;
            count--;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 0 -> 1 (binary 101 = decimal 5)
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        BinaryToDecimal converter = new BinaryToDecimal();
        System.out.println("Decimal value: " + converter.getDecimalValue(head)); // Output: 5
    }
}