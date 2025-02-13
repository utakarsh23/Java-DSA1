package StacksAndQueus;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(36);
        stack.push(38);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);


    }
}
