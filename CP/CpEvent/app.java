package CpEvent;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int k = input.nextInt();
        String s = input.next();
        int i = 0;
        String w = "";
        while(i < s.length()) {
            char c = s.charAt(i);
            if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                w = w+s.charAt(i)+"";
            }
            i++;
        }
        System.out.println(w);
    }
//    static
}
