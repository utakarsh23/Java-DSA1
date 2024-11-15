package ArrayListssss;
import java.util.*; //imp to use lists
public class listsss {
    public static void main(String[] args) {
        /* ArrayList */
        List<String> li = new ArrayList<String>(); // to descrive interfaces ArrayList
        li.add("Utkarsh"); //adding element into the ArrayList
        li.add("Shaurya");
        li.add("Dhruv");
        li.add(2, "Raghav"); //adding element at the index 2
        System.out.println(li.toString()); //print
        li.remove(0); //removing emement at index 0(Utkarsh)
        System.out.println(li.toString()); 
        li.remove("Shaurya"); //removing element by using the string
        System.out.println(li);
        System.out.println(li.size()); //printing size of the list
        System.out.println("--------------------------");
        /* LinkedList */
        LinkedList<String> lis = new LinkedList<String>(); //to descrive interfaces LinkedList
        lis.add("iPhone");
        lis.add("Samsung"); //adding element into the LinkedList
        lis.add("Xiaomi");
        System.out.println(lis); //print
        System.out.println(lis.size()); //size
        lis.remove(0); //removing element at index 0
        lis.remove("Samsung"); //removing element by using string
        System.out.println(lis); //print
        System.out.println(lis.size()); //size
        System.out.println("--------------------------");
        /* Vector */
        Vector<String> vec = new Vector<String>(); //to descrive interfaces Vector
        vec.add("mango"); //adding element into the Vector
        vec.add("apple");
        vec.add("banana");
        System.out.println(vec); //print
        System.out.println(vec.size()); //size
        vec.remove(0); //removing element at index 0
        vec.remove("apple"); //removing element by using string
        System.out.println(vec);
        vec.clear(); //to remove all the element from the Vector
        System.out.println(vec); //print
        System.out.println(vec.size()); //size
    }
}
