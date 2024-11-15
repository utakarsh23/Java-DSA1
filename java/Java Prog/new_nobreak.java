
import java.util.Scanner;

public class new_nobreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String device = input.next();
        switch(device) {
            case "Samsung", "vivo", "oppo", "redmi" -> System.out.println("Android");
            case "iphone", "ipad" -> System.out.println("IOS");
            default -> System.out.println("invalid");
        }
    }
}
