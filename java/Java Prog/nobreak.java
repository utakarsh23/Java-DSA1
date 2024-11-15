
import java.util.Scanner;

public class nobreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String device = input.next();
        switch(device) {
            case "Samsung" :
            case "vivo" :
            case "oppo" :
            case "redmi" :
                System.out.println("Android");
                break;
            case "iphone" :
            case "ipad" :
                System.out.println("IOS");
                break;
                default:
                System.out.println("invalid");
        }
    }
}
