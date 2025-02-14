package StacksAndQueus;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {

        //
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(36);
//        stack.push(38);
//
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);


        /// LIFO
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(45);
//        queue.add(46);
//        queue.add(47);
//        queue.add(48);
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        queue.remove();
//        System.out.println(queue.peek());
//        System.out.println(queue);
//        queue.add(56);
//        System.out.println(queue);

        /// lets us add from both the sides, faster than stack and LL
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(45);
        deque.add(47);
        deque.add(49);
        deque.add(52);
        System.out.println(deque);
        deque.addFirst(72);
        deque.add(74);
        System.out.println(deque);
        deque.addLast(67);
        System.out.println(deque);
    }
}
