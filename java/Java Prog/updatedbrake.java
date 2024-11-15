import java.util.Scanner;
public class updatedbrake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String appss = input.next();
        switch(appss){
            case "ios" -> System.out.println("iphone");
            case "android" -> System.out.println("samsung");
            default -> System.out.println("invalid");
        }
    }
}
