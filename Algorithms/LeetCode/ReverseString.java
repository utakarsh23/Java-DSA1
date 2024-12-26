package LeetCode;
//https://leetcode.com/problems/reverse-string/
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] apps = {'a', 'l', 's','v', 'h', 'r', 't', 'w', 'x'};
        reverseString(apps);
        System.out.println(Arrays.toString(apps));
    }
//    static void reverseString(char [] s, int start, int end) {
//        if(start < s.length/2) {
//            swap(s, start, end);
//        } else if (start > end/2) {
//            return;
//        }
//        reverseString(s, start+1, end-1);
//    }
//    static void swap(char[] s, int start, int end) {
//        char temp = s[start];
//        s[start] = s[end];
//        s[end] = temp;
//    }

    static void reverseString(char [] s) {
        // if(start < s.length/2) {
        //     swap(s, start, end);
        // } else if (start > end/2) {
        //     return;
        // }
        // reverseString(s, start+1, end-1);
        int start = 0;
        int end = s.length-1;
        swap(s, start, end);
    }
    static void swap(char[] s, int start, int end) {
        if(start < s.length/2) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        } else if (start > end/2) {
            return;
        }
        swap(s, start+1, end-1);
    }
}
