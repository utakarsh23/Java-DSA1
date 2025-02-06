package Encapsulation.Testing;

import Encapsulation.Access.A;

public class Main {
    public static void main(String[] args) {
        A obj = new A(23, "Shresth");
        obj.getAge();
        /// it can be accessed through here too as it's public but we can't acces the obj.num here as well.

//        obj.name;
        /// here we cannot access it as it is not in the same directory, default modifier works this way
    }
}
