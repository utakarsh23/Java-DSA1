// https://leetcode.com/problems/two-sum?envType=problem-list-v2&envId=array&difficulty=EASY
import java.util.Arrays;
public class asas {
    public static void main(String[] args) {
    int[] arrs = new int[] {3,2,4};
    int[] arss1 = new int[2];
    int target = 5;
    for(int i = 0; i< arrs.length; i++) {
        for(int j = 0; j<arrs.length; j++) {
            if(i != j && arrs[i] + arrs[j] == target ) {
                if(i<j) {
                    arss1[0] = i;
                    arss1[1] = j;
                    }
                if(i>j) {
                    arss1[0] = j;
                    arss1[1] = i;
                }
                }
            }
        }
        System.out.println(Arrays.toString(arss1));
    }
}
