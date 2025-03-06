package LeetCode;

class CheckIfNumberIsASumOfPowersOfThree {

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(11));
    }
    static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}