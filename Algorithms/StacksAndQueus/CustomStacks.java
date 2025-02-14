package StacksAndQueus;

public class CustomStacks {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStacks() {
        this(DEFAULT_SIZE);
    }

    public CustomStacks(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws Exception {
        if(isFull()) {
            throw new Exception("Stack is full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == - 1;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot pop from an empty stack!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot peek inside an empty stack!!");
        }
        return data[ptr];
    }
}
