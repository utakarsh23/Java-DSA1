public class methodoverloading {
    public static void main(String[] args) {
        //there can be diff functions with same name but we need 
        //to make sure that they have diff no of args(int a, int b & int a) or diff type of args(int a & String name)
        //else if they hav same(int a & int a) then it is wrong
        fun(6); //prints func(1)
        fun(6,7); //prints func(2)
        fun("Utkarsh"); //prints func(3)
    }
    static void fun(int a) { //fun func 1 with int ->(1)
        System.out.println(a);
    }
/*  static void fun(int a) {  ---> wrong on as fun(int a) is already defined
        System.out.println(a);
    }  */ 
    static void fun(int a, int b) { //fun func 2 with more int variables ->(2)
        System.out.println(a + b);
    }
    static void fun(String name) { //fun func 3 with String ->(3)
        System.out.println(name);
    }
}