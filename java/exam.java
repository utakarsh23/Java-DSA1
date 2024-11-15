
import java.util.Arrays;

public class exam {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9,10}; //arr(object)
        change(arr); //mutating array(possible)
        System.out.println(Arrays.toString(arr)); //returning
        String name1 = "Shresth Tiwari";  //string object
        change1(name1); //changing string(not possible)
        System.out.println(name1);//so Shresth Tiwari will be printed instead of Utkars Mani 
    }
    static void change(int[] num) {
        num[0] = 10; //here num is pointing out to same obj(arr in this case) so it will change the value of arr too
    }
    static void change1(String name) {
        name = "utkarsh Mani"; //here we are not modifying the string, we are creating a new object so it won't be changed 
    }
}
