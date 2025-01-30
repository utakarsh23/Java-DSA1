package LeetCode;

public class NumberOfSegmentInString {
    public static void main(String[] args) {
        String s = "    foo    bar";
        System.out.println(countSegments(s));
    }
    static int countSegments(String s) {
        if(s == null || s == "" || s == " " || s.isEmpty()) return 0;
        String[] sh = s.split("\\s+");
        int count = sh.length;
        for (int i = 0; i < sh.length; i++) {
            if(sh[i].isEmpty() || sh[i] == null || sh[i] == "" || sh[i] == " ") {
                 count--;
            }
        }
        return count;
    }
}
