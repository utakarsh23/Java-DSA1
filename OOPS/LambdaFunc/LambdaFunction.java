package LambdaFunc;

import java.util.ArrayList;

public class LambdaFunction {
    static int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int x = sum(5, 7);
        System.out.println(x);

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
        arr.forEach((item) -> System.out.println(item*2));

    }
}
