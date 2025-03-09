package LeetCode;

class ReversePrefixOfWord {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcefd", 'd'));
    }
    static String reversePrefix(String s, char ch) {
//        StringBuilder sb = new StringBuilder();
        int ind = s.indexOf(ch);
        if(ind == -1) return s;
        String sn = reverseStrs(s, ind);
        return sn+s.subSequence(ind+1, s.length());
    }

    private static String reverseStrs(String s, int ind) {
        String t = "";
        for (int i = 0; i <= ind; i++) {
            t = s.charAt(i)+t;
        }
        return t;
    }
}