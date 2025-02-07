package Interfaces.ExtendInterfacesDemos2;

public interface A {

    default void fun() {
        System.out.println("I'm in 'A'");
    }

}
