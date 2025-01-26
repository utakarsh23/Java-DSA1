package staticExample;


class test2 {
    static String name;

    public test2(String name) {
        test2.name = name;
    }
}


public class InnerClass2 {

    /// hear the static class test, one is not dependent on the objects of inner class,
    static class test1 {
        String name;

        public test1(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {

        test1 a = new test1("Utkarsh");
        test1 b = new test1("Shresth");

        System.out.println(a.name);
        System.out.println(b.name);

        test2 c = new test2("Neha");
        test2 d = new test2("Nehu");

        System.out.println(c.name);
        System.out.println(d.name);
    }
}
