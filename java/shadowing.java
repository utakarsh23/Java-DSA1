public class shadowing {
    static int x = 17; //this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //17
        int x; //var at line 2 is shadiowed by this 
        x = 20;
        System.out.println(x); //20
        calx(); //17
    }
    static void calx() {
        System.out.println(x);
    }
}
