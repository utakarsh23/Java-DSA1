package LeetCode;
//https://leetcode.com/problems/length-of-last-word
public class LenOfLasrWord {
    public static void main(String[] args) {
        System.out.println(len("hehe"));
    }
    static int len(String s){
        int w = s.trim().length();
        int l = s.trim().lastIndexOf(" ");
        return (w-1)-l;
    }
}
