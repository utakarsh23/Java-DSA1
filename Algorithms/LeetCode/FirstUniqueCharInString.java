package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    static int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for(char c='a'; c<='z';c++){
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    static int firstUniqChar1(String s){
        int[] freq=new int[26];
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            freq[chars[i] - 'a']++;
        }
        for(int i=0;i<chars.length;i++){
            if(freq[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
