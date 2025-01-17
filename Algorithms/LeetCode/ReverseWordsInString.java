package LeetCode;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
//    static String reverseWords(String s) {
//        String sb = "";
//        int j = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(i == s.length()-1 || i == 0 || s.charAt(i) == ' ') {
//                if(i == s.length()-1) {
//                    sb =  s.substring(j, i+1) + " " +  sb;
//                    break;
//                }
//                if(i == 0) {
//                    sb =  s.substring(j, i) + "" +  sb;
////                    j = i+1;
//                } else {
//                    sb = s.substring(j, i).trim() + " " + sb;
//                    j = i + 1;
//                }
//            }
//        }
//        return sb;
//    }
    static String reverseWords(String s) {
        int i = 0;
        int j = 0;
        int k = 0;
        String sb = "";
        while(i < s.length()) {
            if((s.charAt(i) != ' ')) {
                k++;
            } else {
                sb = s.substring(j, i) + " " + sb;
            }
            if(s.charAt(i) == ' ' && sb != "") {
                j = k;
                i++;
            }
        }
        return sb;
    }
}
