package staticExample;

public class Main {
    public static void main(String[] args) {
//        Human utk = new Human(20, "Utkarsh", 20000, false);
//        System.out.println(utk.population);
//        Human shr = new Human(21, "Shresth", 150000, true);

//        System.out.println(Human.population); ///-(1.1), we can print this even after commenting out the above two
//        System.out.println(Human.population);


    }
    static void fun() {
        /*greetings();*/  ///you can't use this because it requires an instance but the function you are
        ///using it in does not depend on instances

        /// you cannot access non static stuff without referencing their instances in a static context
        /// i.e
        /// here we are referencing it....
            Main object = new Main();
            object.greetings();

        /// we can have the static inside a static one
            fun3();
    }

    static void fun3() {
        System.out.println("hemaa");
    }

    void fun2() {
        System.out.println("heyyyyy");
    }

    void greetings() {
        fun2(); ///we can use non static context in a non static context
        System.out.println("heyy");
    }
}
