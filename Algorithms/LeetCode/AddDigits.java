package LeetCode;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    static int addDigits(int num) {
//        int sum = 0;
        int temp = num;
        while(temp > 9) {
            int sum = 0;
            while(temp > 0) {
                int rem = temp%10;
                temp /= 10;
                sum += rem;
            }
            temp = sum;
        }
        return temp;
    }
}
