package LeetCode;

public class FaultyKeyboard {
    public static void main(String[] args) {
    String s = "poiinter";
        System.out.println(finalString1(s));
    }

    //try again after some time, accepted but takes much time
    static String finalString(String s) {
        int i = 0;
        char[] ch = s.toCharArray();

        String ans = "";
        while(i < s.length()) {
            while (i < s.length() && (s.charAt(i) != 'i' && s.charAt(i) != 'I')) {
                i++;
            }
            if(i >= s.length()) {
                break;
            }
            if(s.charAt(i) == 'i') {
                ans = revStr(s.substring(0, i))+s.substring(i+1, s.length());
                s = ans;
                i--;
            }
        }
        return s;
    }
    static String revStr(String s) {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev = rev+s.charAt(i);
        }
        return rev;
    }

    /// /

    static String finalString1(String s) {
        StringBuilder n=new StringBuilder();
        for(char b:s.toCharArray())
        {
            if(b=='i')
            {
                n.reverse();
            }
            else
            {
                n.append(b);
            }
        }
        return n.toString();
    }
}
