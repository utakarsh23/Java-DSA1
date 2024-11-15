import java.util.Arrays;
public class arrayintegerlist {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6}; //giving elements to the array
        System.out.println("Integers as Arrray lisy : " + Arrays.asList(arr)); //By using an Integer[] (object array), Arrays.asList() will correctly convert the elements to a List of Integer objects.
    }
}