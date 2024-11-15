
import java.util.Scanner;

public class new_break1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruits = input.next();
        switch(fruits) {
            case "Apple", "Banana", "Mango", "Pineapple" -> System.out.println("Sweet Fruits");
            case "dragonfruit", "Strawberries", "grapes" -> System.out.println("Sour Fruits");
            default -> System.out.println("Invalid");
        }
    }
}
