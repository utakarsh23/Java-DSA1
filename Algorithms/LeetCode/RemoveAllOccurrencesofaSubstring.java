package LeetCode;

public class RemoveAllOccurrencesofaSubstring {
    public static void main(String[] args) {
        String s = "eemckxmckx", part =  "emckx";
        System.out.println(removeOccurrences(s, part));
    }

    static public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (s.contains(part)) {
            int fi = sb.indexOf(part);
            if(fi >= 0) {
                sb.delete(fi,fi + part.length());
            }
            s = sb.toString();
        }
        return s;
    }
}
