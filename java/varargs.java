import java.util.Arrays; //brings array class
public class varargs { //instead of typing many args, we use ...v(can be int or string etc)
    public static void main(String[] args) { 
        var(1,2,3,4,5,8,9,10); //calling the function with multiple arguments
        var1("Utkarsh","Dhruv", "Raghav", "Shresth", "Shaurya");
    }
    static void var(int...v) { //...v is varargs for unknow no of int's as int a, int b... int v(infi num in between)
        System.out.println(Arrays.toString(v));
    }
    static void var1(String...w) { //...v is varargs for unknow no of String's as String a, String b... String v(infi Strings in between)
        System.out.println(Arrays.toString(w));
    }
}
