package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class AddToFormInt {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[] {1, 9, 9}, 12));
    }
//    static List<Integer> addToArrayForm(int[] num, int k) {
////        for (int i = num.length-1; i >= 0; i--) {
////            int rem = k%10;
////            if(num[i]+rem < 9) {
////                num[i] = num[i] + rem;
////            }
////        }
//        int i = num.length-1;
//        String s = k+"";
//        int j = s.length()-1;
//        int[] arr = new int[j+1];
//        for (int l = 0; l < s.length(); l++) {
//            arr[l] = Integer.parseInt(s.charAt(l)+"");
//        }
//        int power = 0;
//        while(i >= 0 && j >= 0) {
//            num[i] = num[i] + arr[j] + power;
//            if(num[i] > 9) {
//                int temp = num[i];
//                num[i] = num[i]%10;
//                num[i] = num[i];
//                power = temp/10;
//            } else {
//                power = 0;
//            }
//            i--;
//            j--;
//        }
//        if(power != 0) {
//            num[i] = power+num[i];
//        }
//        List<Integer> li = new ArrayList<>();
//        for (int l = 0; l < num.length; l++) {
//            li.add(num[l]);
//        }
//        return li;
//    }
    static public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }
}
