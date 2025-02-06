package Abstraction;

public class Daughter extends Parent{

    public Daughter(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("Gonna be a Doctor too");
    }

    @Override
    void partner() {
        System.out.println("I love himm");
    }
}
