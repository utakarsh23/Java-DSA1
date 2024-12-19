package Mathematics;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(int a) {
        double x = a;
        double root;
        while (true) {
            root = 0.5*(x + (a/x));

            if(Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;
        }
        return root;
    }
}
