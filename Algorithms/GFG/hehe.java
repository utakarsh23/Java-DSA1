package GFG;

import java.util.Scanner;

public class hehe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String ss = "";
            for(int j=0;j<15-s1.length();j++){
                ss = ss+" ";
            }
            System.out.println(s1 + ss + x);
        }
        System.out.println("================================");

    }
}
