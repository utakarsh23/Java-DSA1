package LeetCode.LinkedLists;

class Node {
    char ch;
    Node prev;
    Node next;

    public Node(char ch, Node prev, Node next) {
        this.ch = ch;
        this.prev = prev;
        this.next = next;
    }
}

public class TextEditor {
    private Node head;
    private Node tail;
    private Node cursor;

    public TextEditor(){
        head = new Node('\0', null, null);
        tail = new Node('\0', null, null);
        head.next = tail;
        tail.prev = head;
        cursor = head;
    }

    public void addText(String text) {
        for (char ch: text.toCharArray()) {
            Node newNode = new Node(ch, cursor, cursor.next);
            cursor.next.prev = newNode;
            cursor.next = newNode;
            cursor = newNode;
        }
    }

//    public int deleteText(int k) {
//
//    }
//
//    public String cursorLeft(int k) {
//
//    }
//
//    public String cursorRight(int k) {
//
//    }
}
