public class swapint {
    public static void main(String[] args) {
        swap(5,7); //returning
    }
    static void swap(int a, int b) { //void as nothing si being returned 
        int temp = a; // storing val of a in temp var 
        a = b; //giving value of b to a
        b = temp; // giving value of temp(a) to b
        System.out.println(a + " " + b); //printing
    }
}
