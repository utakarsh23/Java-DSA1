import java.util.Scanner;

public class nested_breaks2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int emp = input.nextInt();
        String dep = input.next();

        switch(emp) {
            case 1,2 -> System.out.println("Utkarsh");
            case 3 ->  {
                System.out.println("Shaurya");
                switch(dep) {
                    case "IT", "CSE" -> System.out.println("Software Engineer");
                    case "Management" -> System.out.println("Manager");
                    default -> System.out.println("Invalid Department");
                }
            }
        default -> System.out.println("Invalid");
        }
    }
}
