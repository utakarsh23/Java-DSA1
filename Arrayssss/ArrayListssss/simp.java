package ArrayListssss;
import java.util.*;
public class simp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(0,1);
        list1.add(1,2);
        list1.add(2,3);
        list1.addAll(1, list);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        System.out.println(list1.get(3));
        list1.set(list1.size()-2, 5);
        list1.set(list1.size()-1, 6);
        System.out.println(list1);
        
    }
}
