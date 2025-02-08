package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human shresth = new Human(20, "Shresth");
//        Human twin = new Human(shresth);


//        Human twin = (Human) shresth.clone();
//        System.out.println(twin.age+" "+ twin.name);
//        System.out.println(Arrays.toString(twin.arr));
//        //shallow copy
//        System.out.println(Arrays.toString(twin.arr));
//        twin.arr[0] = 101;
//        System.out.println(Arrays.toString(twin.arr));
//        System.out.println(Arrays.toString(shresth.arr));

        //Deep copy

        Human twin = (Human) shresth.clone();
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 101;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(shresth.arr));
    }
}
