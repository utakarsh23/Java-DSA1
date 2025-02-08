package Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student utkarsh = new Student(48, 87.76f);
        Student shresth = new Student(45, 89.96f);
        Student dhruv = new Student(42, 84.96f);
        Student shaurya = new Student(49, 90.96f);

        if(utkarsh.compareTo(shresth) < 0) {
            System.out.println(utkarsh.compareTo(shresth));
            System.out.println("Shresth have more marks");
        }

        Student[] list = {utkarsh, shaurya, shresth, dhruv};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
