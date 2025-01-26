package staticExample;

public class tooStrings {


    //without toString
    static class test1 {
        String name;

        public test1(String name) {
            this.name = name;
        }
    }

    //with toString
    static class test2 {
        String name;

        public test2(String name) {
            this.name = name;
        }

        //adding to String method
        @Override
        public String toString() {
            return name;
        }
    }


    public static void main(String[] args) {

        test1 a = new test1("Utkarsh");

        test2 b = new test2("Shresth");


        System.out.println(a); //gives random hexValue without self toString method
        System.out.println(b); //after adding toString we actually get the true value of it

    }
}
