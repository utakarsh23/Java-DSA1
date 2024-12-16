package Mathematics;

public class MagicNo {
    public static void main(String[] args) {
        System.out.println(magicNo(5));
    }
    static int magicNo(int n) {
        int base = 5;
        int ans = 0;
        while (n > 0) {
            int lastDig = n & 1;
            n = n >>1;
            ans += lastDig*base;
            base = base*5;
        }
        return ans;
    }
}
