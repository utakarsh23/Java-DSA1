package Mathematics;

import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < 41; i++) {
            if(isPrime(i)) {
                li.add(i);
            }
            System.out.println(i + " : " + isPrime(i));
        }
        System.out.println(li);
    }

    static boolean isPrime(int n) {
        if(n<2) {
            return false;
        }
        int c = 2;
        while(c*c <= n) {
            if (n%c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
