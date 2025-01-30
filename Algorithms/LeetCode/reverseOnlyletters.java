package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class reverseOnlyletters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetterss(s));
    }
    static String reverseOnlyLetters(String s) {
        List<Character> li = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                li.add(s.charAt(i));
            }
        }
        int i = 0;
        int j = s.length()-1;
        int k = 0;

        StringBuffer sb = new StringBuffer(s);
        while (i <= j) {
            if(li.contains(s.charAt(i))) {
                sb.setCharAt(i, li.get(li.size()-1-k));
                k++;
            }
            i++;
        }
        return sb.toString();
    }

    //

    static String reverseOnlyLetterss(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left < right) {
            // Move left pointer to the next letter from left
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }

            // Move right pointer to the next letter from right
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }

            // Swap the letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    //

    static String reverseOnlyLettersss(String s) {
        int l=0;
        int r=s.length()-1;
        char[] res=new char[r+1];
        //String result="";
        while(l<=r){
            if(Character.isAlphabetic(s.charAt(l)) && Character.isAlphabetic(s.charAt(r))){
                res[r]=s.charAt(l);
                res[l]=s.charAt(r);
                l++;
                r--;
            }
            else if(!Character.isAlphabetic(s.charAt(r))){
                res[r]=s.charAt(r);
                r--;

            }
            else if(!Character.isAlphabetic(s.charAt(l))){
                res[l]=s.charAt(l);
                l++;
            }
        }

        return new String(res);
    }
}
