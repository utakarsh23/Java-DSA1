package Mathematics;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
    }
    //O(N)
    static List factors(int a) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if(a%i == 0) {
                li.add(i);
            }
        }
        return li;
    }
    //O(sqrt(N))
    static void factors1(int a) {
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if(a%i == 0) {
                if(a/i == i) {
                    System.out.println(i + " ");
                } else {

                    System.out.print(i + " " + a/i + " ");

                }
            }
        }
    }
}
