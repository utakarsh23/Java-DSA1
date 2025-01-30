package LeetCode;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "45678253535283538833633729363444442";
        String num1 = "4206";
        System.out.println(largestOddNumber(num));
    }
    static String largestOddNumber(String num) {
        int i = 0;
        int j = num.length();
        String s = "";
        while (i < j) {
            if((num.charAt(j-1-i)-'0')%2 != 0) {
                return num.substring(0, j-i);
            }
            i++;
        }
        return s;
    }
}
