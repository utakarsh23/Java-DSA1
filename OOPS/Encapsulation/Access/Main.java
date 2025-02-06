package Encapsulation.Access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         A obj = new A(10, "Utkarsh");
//         obj.name;
///         obj.num;  cannot be accesed cause it's private but we can access it via getters and setters;
        //example----------------------------------------------------------------------------------
///        ArrayList<Integer> li = new ArrayList<>();
///            li.DEFAULT_CAPACITY;
        //cannot be accessed-----------------------------------------------------------------------

        // before getters and setters ^^

        obj.getAge();
        obj.setAge(20);
        System.out.println(obj.getAge());

        String s = obj.name; ///  here it can be accessed as the directory is same -------(2)
    }
}
