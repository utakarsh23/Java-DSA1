package LeetCode;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky hi is     lol    blue";
        System.out.println(reverseWordss(s));
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
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        String sb = "";
//        while(i < s.length()) {
//            if(i == s.length()-1) {
//                    sb =  s.substring(j+1, i+1) + "" +  sb;
//                    break;
//                }
//            if((s.charAt(i) != ' ')) {
//                k++;
//            } else {
////                if()
//                sb = s.substring(j, i) + " " + sb;
//            }
//            if(s.charAt(i) == ' ' && sb != "") {
//                j = k+1;
//            }
//            i++;
//        }
//        return sb;
//    }

        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim();
    }

    //two pointer
    static String reverseWordss(String s) {
        String[] arr = s.trim().split("\\s+");
        int i=0,j=arr.length-1;
        while(i<j) {
            String t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        return String.join(" ", arr);
    }
}
