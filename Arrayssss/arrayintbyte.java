

public class arrayintbyte {
    public static void main(String[] args) {
        int intarr[] = new int[3];          //introducing an array of size 3 of type int elements  
        byte bytearr[] = new byte[3];       //introducing an array of size 3 of type byte elements
        String stringarr[] = new String[3]; //imtroducing an array of size 3 of type String elements
        short shortarr[] = new short[3];    //introducing an array of size 3 of type short elements
        long longarr[] = new long[3];       //introducing an array of size 3 of type long elements
        float floatarr[] = new float[3];    //introducing an array of size 3 of type float elements
        double doublearr[] = new double[3]; //introducing an array of size 3 of type double elements
        char chararr[] = new char[3];       //introducing an array of size 3 of type char elements
        boolean boolarr[] = new boolean[3]; //introducing an array of size 3 of type boolean elements
                //printing the class of the arrays
        System.out.println(intarr.getClass());    //the String '[I' is run time type signature of the object class array of type int 
        System.out.println(intarr.getClass().getSuperclass()); //the String 'java.lang.Object' is the super class of the object class array of type int
        System.out.println(bytearr.getClass());   //the String '[B' is run time type signature of the object class array of type byte
        System.out.println(bytearr.getClass().getSuperclass()); //the String 'java.lang.Object' is the super class of the object class array of type byte
        System.out.println(stringarr.getClass()); //the String '[Ljava.lang.String;' is run time type signature of the object class array of type String
        System.out.println(stringarr.getClass().getSuperclass());//the String 'java.lang.Object' is the super class of the object class array of type String
        System.out.println(shortarr.getClass());  //the String '[S' is run time type signature of the object class array of type short
        System.out.println(longarr.getClass());   //the String '[J' is run time type signature of the object class array of type long
        System.out.println(floatarr.getClass());  //the String '[F' is run time type signature of the object class array of type float
        System.out.println(doublearr.getClass()); //the String '[D' is run time type signature of the object class array of type double
        System.out.println(chararr.getClass());   //the String '[C' is run time type signature of the object class array of type char
        System.out.println(boolarr.getClass());   //the String '[Z' is run time type signature of the object class array of type boolean
    }
}
