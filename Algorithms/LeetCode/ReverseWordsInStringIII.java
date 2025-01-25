package LeetCode;

public class ReverseWordsInStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords1(s));
    }

    //it's inconvenient thou
    static String reverseWords(String s) {
        String[] t = s.split("\\s+");
        for (int i = 0; i < t.length; i++) {
            reverse(t, i);
        }

        String fina = "";
        for (int i = 0; i < t.length; i++) {
            fina = fina + " " + t[i];
        }
        return fina.trim();
    }
    static void reverse(String[] words, int index) {
        String s = "";
        for (int i = 0; i < words[index].length(); i++) {
            s = words[index].charAt(i)+s;
        }
        words[index] = s;
    }

    //m2
    static String reverseWords1(String s) {
        String[] t = s.split("\\s+");
        StringBuilder ss = new StringBuilder();
        for(String words : t) {
            StringBuilder reversed = new StringBuilder(words);
            ss.append(reversed.reverse()).append(" ");
        }
        return ss.toString().trim();
    }


}
