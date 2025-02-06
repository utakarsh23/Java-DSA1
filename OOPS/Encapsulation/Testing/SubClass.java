package Encapsulation.Testing;

import Encapsulation.Access.A;

public class SubClass extends A {
    public SubClass(int age, String name) {
        super(age, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(34, "Tiwari");
        int dob1 = obj.dob; /// protected can be accesed through a subClass too,(Diff Package)
    }
}
