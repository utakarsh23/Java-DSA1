package LeetCode;

public class ComplexNoMultiPlication {
    public static void main(String[] args) {
        String num1 = "1+-1i";
        String num2 = "1+-1i";
        System.out.println(complexNumberMultiply(num1, num2));
    }

    static String complexNumberMultiply(String num1, String num2) {
        String a = "";
        String b = "";
        String a1 = "";
        String b1 = "";
        for (int i = 0; i < num1.length(); i++) {
            if(num1.charAt(num1.length()-1-i) == '+') {
                a = num1.substring(num1.length()-i, num1.length()-1);
                b = num1.substring(0, num1.length()-1-i);
                break;
            }
        }
        for (int i = 0; i < num2.length(); i++) {
            if(num2.charAt(num2.length()-1-i) == '+') {
                a1 = num2.substring(num2.length()-i, num2.length()-1);
                b1 = num2.substring(0, num2.length()-1-i);
                break;
            }
        }
        int real = Integer.parseInt(b);
        int imaginaryNo = Integer.parseInt(a);
        int real1 = Integer.parseInt(b1);
        int imaginaryNo1 = Integer.parseInt(a1);


        int sReal = real * real1 - imaginaryNo * imaginaryNo1;
        int sImagi = real * imaginaryNo1 + real1 * imaginaryNo;
        String s = sReal + "+" + sImagi+"i";


        return s;
    }
//    static void getIntOfString(String num1, String num2) {
//        String a = "";
//        String b = "";
//        String a1 = "";
//        String b1 = "";
//        for (int i = 0; i < num1.length(); i++) {
//            if(num1.charAt(num1.length()-1-i) == '+') {
//                a = num1.substring(num1.length()-i, num1.length()-1);
//                b = num1.substring(0, num1.length()-1-i);
//            }
//        }
//        for (int i = 0; i < num2.length(); i++) {
//            if(num2.charAt(num2.length()-1-i) == '+') {
//                a1 = num2.substring(num2.length()-i, num2.length()-1);
//                b1 = num2.substring(0, num2.length()-1-i);
//            }
//        }
//        int real = Integer.parseInt(a);
//        int imaginaryNo = Integer.parseInt(b);
//        int real1 = Integer.parseInt(a1);
//        int imaginaryNo1 = Integer.parseInt(b1);
//    }
}
