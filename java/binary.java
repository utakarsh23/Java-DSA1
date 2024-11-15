import java.util.*;
public class binary {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // to take the input
        int num_bin = input.nextInt();
        int quo = num_bin; //firset quo will be num_bin
        int rem = 0; //initialising rem to keep it universal 
        while (quo!=0) { //if quo = 0, then the code sto(ps working 
            rem = quo%2; //rem%2 will give the remainder(0 or 1 as div by 2)
            quo = quo/2; //quo div by 2 will give next quotient
            // System.out.print(rem); // reverse it and it will be the binary number
            int aps = rem;
            }
            System.out.println(rem);
            // int rev = 0; 
           
        }
        
    }

