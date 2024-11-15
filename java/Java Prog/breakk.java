import java.util.Scanner;
public class breakk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
            switch(fruit){
                case "Mango" : System.out.println("King of fruits");
                break;
                case "Apple" : System.out.println("Sweet red fruit");
                break;
                case "Banana" : System.out.println("Yellow fruit");
                break;
                default : System.out.println("Invalid fruit");
            }
    }
}
