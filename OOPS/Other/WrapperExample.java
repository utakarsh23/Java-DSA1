package Other;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        //here it won't be swapped as in java there's no pass by ref, it's pass by value
        //and the func passes the values not the variables to be swapped;
        //but for the objects, the reference value is passed
        //but it gets swapped for only inside the function
        swap(a, b);
        System.out.println(a + " " + b); ///---> 9, 8
            /// won't be getting swapped



        Integer c = 6;
        Integer d = 7;
        //even for the primitive data type, it won't be swapped because of the 'final' keyword(Command + Click on Integer) inside the Integer
        swapPrimitive(c, d);
        System.out.println(c + " " + d);
        /// won't be getting swapped


        //here 'e' can't be modified as we use the final keyword.
        //well try to drop the variable in capitalised form(good code practice)
        /// it's only applicable for primitive data types
        ///the 'final' keyword ensures that the assigned value does not get modified;
        /// here the value 90 is assigned to the variable 'E', and e can't be modified now,
        final Integer E = 90;
//        E = 87;
        /// it gives an error when trying to change it, same as here on 'E';

    }





    //won't swap
    static void swap(Integer a, Integer b) { ///  a = 9, b = 8
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b); ///---> 8, 9
        /// got swapped inside the function
    }

    static void swapPrimitive(int a, int b) { ///  a = 9, b = 8
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b); ///---> 8, 9
        /// got swapped inside the function
    }
}
