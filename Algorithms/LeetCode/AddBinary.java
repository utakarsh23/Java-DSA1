package LeetCode;

class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }


    static String addBinary(String a, String b) {
        char[] s = a.toCharArray();
        char[] t = b.toCharArray();
        int i = s.length-1;
        int j = t.length-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || carry > 0) {
            int aNo = i >= 0 ? s[i]-'0' : 0;
            int bNo = j >= 0 ? t[j]-'0' : 0;

            int sum = aNo + bNo + carry;
            int dig = sum%2;
            carry = sum/2;
            i--;
            j--;
            sb.append((char)(dig + '0'));
        }
        return sb.reverse().toString();
    }


    //////
//    static String addBinary1(String a, String b) {
//        char[] s = a.toCharArray();
//        char[] t = b.toCharArray();
//        int i = s.length-1;
//        int j = t.length-1;
//        StringBuilder sb = new StringBuilder();
//        while(true) {
//            if(s[i]-'0' + t[i]-'0' == 2) {
//                sb.append('0');
//            }
//        }
//    }
}