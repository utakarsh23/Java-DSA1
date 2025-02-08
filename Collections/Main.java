import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        list1.add(45);
        list1.add(48);
        list1.add(49);
        list1.add(43);
        System.out.println(list1);


        List<Integer> list2 = new Vector<>();
        list2.add(45);
        list2.add(48);
        list2.add(49);
        list2.add(43);
        System.out.println(list2);

    }
}
