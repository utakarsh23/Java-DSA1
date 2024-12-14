package LeetCode;
//https://leetcode.com/problems/multiply-strings/
public class MultiplyingStrings {
    public static void main(String[] args) {
        String a = "12";
        String b = "456";
        System.out.println(intconv(a, b));

    }
    static int intconv(String num1, String num2){
        int i = 0;
        int l = 0;
        int len = num1.length();
        for (int j = 0; j < len; j++) {
            char k = (num1).charAt(j);
            i = i*10+(int)k-48;
        }
        len = num2.length();
        for (int j = 0; j < len; j++) {
            char m = (num2).charAt(j);
            l = l*10+(int)m-48;
        }
        return i*l;
    }

}
