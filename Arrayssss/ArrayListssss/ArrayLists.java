package ArrayListssss;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> LL = new ArrayList<Integer>();
        for(int i = 1; i <= 6; i++) {
            LL.add(i);
        }
        System.out.println("Addition of 1 to 5 elements in the List" + LL);
        LL.remove(2);
        System.out.println("Removed index 2:                       " + LL);
        int i = 0;
        LL.add(3, 2);
        for(i = 0; i< LL.size()-1; i++) {
        System.out.print(LL.get(i) + " "); 
    }
        int index = LL.indexOf(2);
        System.out.println("\nFirst Index of 2 is : " + index);
        int index1 = LL.lastIndexOf(2);
        System.out.println("Last Index of 2 is : " + index1);
        int a = LL.get(0);
        int b = LL.get(1);
        int c = LL.get(2);
        System.out.println(a + " " + b + " " + c);
        boolean isinside = LL.contains(2);
        System.out.println(isinside);
        boolean isinside1 = LL.contains(8);
        System.out.println(isinside1);
        LL.addAll(0,LL);
        System.out.println(LL);
        System.out.println(LL.size());
        LL.set(3, 4);
        System.out.println(LL);
    }

}