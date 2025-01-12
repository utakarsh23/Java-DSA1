package LeetCode;

public class CountDigitsThatDIvANumber {
    public static void main(String[] args) {
        System.out.println(countDigits(1201));
    }
    static int countDigits(int num) {
        int count = 0;
        int dummyNum = num;
        while(dummyNum > 0) {
            int rem = dummyNum%10;
            dummyNum/=10;
            if(rem == 0) continue;
            if(num%rem == 0) {
                count++;
            }
        }
        return count;
    }
}
