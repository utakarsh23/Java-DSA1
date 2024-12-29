package LeetCode;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "abc";
        int[] indices  = {0,2,1};
        System.out.println(restoreString(s, indices));
    }
    static String restoreString(String s, int[] indices) {
        char[] str = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            str[i] = s.charAt(i);
        }
        cyclicSort(indices, str);
        String ch = "";
        for (int i = 0; i < str.length; i++) {
            ch = ch + str[i];
        }
        return ch;
    }
//    static void swap(char[] s, int a, int b) {
//        char temp = s[a];
//        s[a] = s[b];
//        s[b] = temp;
//    }
    static void cyclicSort(int[] arr, char[] s) {
        int i = 0;
        while(i < arr.length) {
            int correctInd = arr[i]; // -> when Array contains zero
            if(arr[i] != arr[correctInd]) {
                swap1(arr, i, correctInd,s, i, correctInd);
//                swap(s, i, correctInd);
            } else {
                i++;
            }
        }
    }

    static void swap1(int[] arr, int first, int second, char[] s, int a, int b) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        char temp1 = s[a];
        s[a] = s[b];
        s[b] = temp1;
    }
}
