package LeetCode;

class PowerOfThree {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(9));
    }
    static boolean isPowerOfThree(int n) {
        long s = n;
        for(int i = 0; i < 20; i++) {
            int x = (int)Math.pow(3, i);
            if(x == n) return true;
        }
        return false;
    }
}