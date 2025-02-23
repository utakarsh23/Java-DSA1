package LeetCode;

public class DigitsEqualAfterOperation {
    public static void main(String[] args) {
        String s = "919";
        System.out.println(hasSameDigits(s));
//        System.out.println(20%10);
    }

    static boolean hasSameDigits(String s) {
        while(s.length() > 2) {
            String temp = "";
            for(int i = 0; i < s.length()-1; i++) {
                int apisum = (Integer.parseInt(s.charAt(i)+"") + Integer.parseInt(s.charAt(i+1)+""))%10;
                temp = apisum + temp; //remember to store in String as 0's may cause problem while being saved
            }
            s = temp;
        }
        if(s.charAt(0) != s.charAt(1)) return false;
        return true;
    }

}
