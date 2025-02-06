package Abstraction;

public class Son extends Parent{

    public Son(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("Gonna be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Herr");
    }

    @Override
    void normalMethod() { //overriding normal method
        super.normalMethod();
    }
}
