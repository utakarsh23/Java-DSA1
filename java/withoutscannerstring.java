public class withoutscannerstring {
    public static void main(String[] args) {
        String names = greet("Raghav"); //providing name a vale string 
        System.out.println(names); //printing
    }
    static String greet(String name) { //initialising a input name to enter
        return "Hey, " + name; //returning string("hey") & name
    }
}