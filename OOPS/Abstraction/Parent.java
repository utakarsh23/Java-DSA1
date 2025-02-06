package Abstraction;

public abstract class Parent {

    int age;
    abstract void career();
    abstract void partner();

//    abstract Parent();
    /// we can't even create constructors for abstract class.

// but we can always create static method in abstract classes.
    static void helloStaticMethod() {
        System.out.println("heyyyy");
    }

    void normalMethod() {
        System.out.println("heyaa I'm a normal method");
    }
}

