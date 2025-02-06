package Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(32);
        daughter.career();

//        Parent mom = new Parent();
        /// for abstract classes we can't create objects like this without implementing methods

        Parent.helloStaticMethod(); //calling the static method

        son.normalMethod(); //normal method being called
    }
}
