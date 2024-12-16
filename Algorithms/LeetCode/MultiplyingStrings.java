package LeetCode;

import java.math.BigInteger;

//https://leetcode.com/problems/multiply-strings/
public class MultiplyingStrings {
    public static void main(String[] args) {
        String a = "498828660196";
        String b = "840477629533";
        System.out.println(INS(a, b));

    }
//    static String intconv(String num1, String num2){
//        BigInteger i = new BigInteger(String.valueOf(0));
//        BigInteger l = new BigInteger(String.valueOf(0));
//        long len = num1.length();
//        for (int j = 0; j < len; j++) {
//            char k = (num1).charAt(j);
//            i = i*10+(int)k-48;
//        }
//        len = num2.length();
//        for (int j = 0; j < len; j++) {
//            char m = (num2).charAt(j);
//            l = l*10+(int)m-48;
//        }
//        long ss = (i*l);
//        String t = ss+" ";
//        return t;
//    }
    static String INS(String num1, String num2){
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger ab = a.multiply(b);
        return ab.toString();
    }

}
