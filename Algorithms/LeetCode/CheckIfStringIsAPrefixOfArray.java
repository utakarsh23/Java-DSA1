package LeetCode;

public class CheckIfStringIsAPrefixOfArray {
    public static void main(String[] args) {
        String s = "iloveleetcode"; String[] words = {"apples","i","love","leetcode"};
        System.out.println(isPrefixString(s, words));
    }

    static boolean isPrefixString(String s, String[] words) {
        StringBuilder str = new StringBuilder();
        for(String st : words){
            str.append(st);
            if(str.length() > s.length()){
                break;
            }
            if(str.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
}
