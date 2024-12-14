package LeetCode;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FirstOccurance {
    public static void main(String[] args) {
        System.out.println(indexof("sadbutsad", "sad"));
    }
    static int indexof(String heystack, String needle) {
        if(heystack.contains(needle)) {
            return heystack.indexOf(needle);
        }
        return -1;
    }
}
