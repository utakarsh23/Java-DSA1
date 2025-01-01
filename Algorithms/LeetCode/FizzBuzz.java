package LeetCode;
///https://leetcode.com/submissions/detail/1494021703/
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(0));
    }
    static List<String> fizzBuzz(int n) {
        List<String> li = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if(i%3 == 0 && i%5 == 0) {
                li.add("FizzBuzz");
            } else if (i%3 == 0) {
                li.add("Fizz");
            } else if (i%5 == 0) {
                li.add("Buzz");
            } else {
                String s = String.valueOf(i);
                li.add(s);
            }
        }

    return li;
    }
}
