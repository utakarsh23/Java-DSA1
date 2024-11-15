import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue {
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<Integer>();
        while(!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queues1 = new ArrayDeque<Integer>();
        queues1.add(10);
        queues1.add(20);
        queues1.add(30);
        queues1.add(40);
        System.out.println(queues1);
        reverse(queues1);
        System.out.println(queues1);

    }
}
