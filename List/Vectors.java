import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> LL = new Vector<Integer>();
        for(int i = 1; i <= 5; i++) {
            LL.add(i);
        }
        System.out.println("Addition of 1 to 5 elements in the List" + LL);
        LL.remove(2);
        System.out.println("Removed index 2:                       " + LL);
        int i = 0;
        int w = 0;
        for(i = 0; i< LL.size()-1; i++) 
        System.out.print(LL.get(i) + " ");
    }
}