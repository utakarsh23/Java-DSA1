import java.util.Scanner;
public class func {
    public static void main(String[] args) {
        System.out.println(sum()); //prints the sum
    }
    static int sum() { // int: specifies the returning value is sum
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int sum = a+b;
        return sum; // returns the sum 
        
    }
}
