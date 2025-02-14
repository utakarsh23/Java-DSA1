package StacksAndQueus;

public class Main {
    public static void main(String[] args) throws Exception {
//
//        CustomStacks stack = new CustomStacks(5);
//        stack.push(56);
//        stack.push(57);
//        stack.push(58);
//        stack.push(59);
//        stack.push(60);
//        stack.push(66);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(stack.pop());
//        }
//
//        DynamicStack stack1 = new DynamicStack();
//        stack1.push(56);
//        stack1.push(57);
//        stack1.push(58);
//        stack1.push(59);
//        stack1.push(60);
//        stack1.push(56);
//        stack1.push(57);
//        stack1.push(58);
//        stack1.push(59);
//        stack1.push(60);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(stack1.pop());
//        }

        CustomStacks qq = new DynamicStack();
        qq.push(45);
        qq.push(45);
        qq.push(45);
        qq.push(45);
        qq.push(45);
        qq.push(45);
        qq.push(45);
        qq.push(45);
        qq.push(45);
        qq.push(45);
        for (int i = 0; i < 10; i++) {
            System.out.println(qq.pop());
        }

    }
}
