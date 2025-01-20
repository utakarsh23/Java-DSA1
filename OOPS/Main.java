import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// stores 5 Integers
//        int[] arr = new int[5];
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            arr[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
        /// Store 5 Strings
//        String[] arr1 = new String[5];
//        for (int i = 0; i < 5; i++) {
//            arr1[i] = input.nextLine();
//        }
//        System.out.println(Arrays.toString(arr1));

        /// Data of 5 Students containing {name, roll No, Marks}
//        Student[] student = new Student[5];
//        System.out.println(Arrays.toString(student));


        ///by this the student1 object will be pointing to a the object of a student type in the heap memory;
        ///new-> it creates a new dynamically allocates memory and returns a ref variable to it which will be stored in variable(student1) in this case.
//        Student student1;
//        student1 = new Student();
//        System.out.println(student1.rNo); --> 0
//        System.out.println(student1.name); --> null
//        System.out.println(student1.marks); --> 0.0
/// ------------------------------------------------------------------------------------------


//        Student student1;
//        student1 = new Student();
//
//        student1.rNo = 12;
//        student1.name = "Utkarsh";
//        student1.marks = 89.07f;
//        System.out.println(student1.rNo); //--> 12
//        System.out.println(student1.name); //--> Utkarsh
//        System.out.println(student1.marks); //--> 89.07

/// ------------------------------------------------------------------------------------------


//        StudentEx2 student2;
//        student2 = new StudentEx2();
//
//        student2.rNo = 12;
//        student2.name = "Utkarsh";
//        System.out.println(student2.rNo); //--> 12
//        System.out.println(student2.name); //--> Utkarsh
//        System.out.println(student2.marks); //--> 90.0
//        student2.marks = 89.07f;
//        System.out.println(student2.marks); //--> 89.07

/// ------------------------------------------------------------------------------------------

//with constructor
//        Student stu1 = new Student();
//        System.out.println(stu1.rNo); //--> 12
//        System.out.println(stu1.name); //--> Utkarsh
//        System.out.println(stu1.marks); //--> 89.07


/// ------------------------------------------------------------------------------------------
//
//
//        Student stu1 = new Student();
//        stu1.changeName("Shresth");
//        stu1.greet();


/// ------------------------------------------------------------------------------------------

//
//        Student stu2 = new Student(17, "Utkarsh", 18.7f);
//        System.out.println(stu2.name);
//

/// ------------------------------------------------------------------------------------------



//        Student stu2 = new Student(17, "Utkarsh", 98.7f);
//        Student stu3 = new Student(stu2);
//        System.out.println(stu3.name);


/// ------------------------------------------------------------------------------------------


        /// here two is pointing towards one in the stack memory, so when two's changes to {name}, then it get's
        /// changes for one too;
//        Student one = new Student();
//        Student two = one;
//        one.name = "Sujal";
//        System.out.println(two.name); => Sujal
//        System.out.println(one.name); => Sujal
//


/// ------------------------------------------------------------------------------------------


        /// here two is pointing towards one in the stack memory, so when one's changes to {name}, then two get's
        /// changes for itself too;
        Student one = new Student();
        Student two = one;
        two.name = "Sujal";
        System.out.println(two.name);
        System.out.println(one.name);





    }
}
class Student {
    int rNo;
    String name;
    float marks;



    /// we need a way to add the values of above properties object by object
    /// constructor
    Student() {
        /// wrong way
//        student1.rNo = 12;
//        student1.name = "Utkarsh";
//        student1.marks = 89.07f;
        this.rNo = 17;
        this.name = "Utkarsh";
        this.marks = 99.07f;

    }


    public Student(int rNo, String name, float marks) {
        this.rNo = rNo;
        /// this can't be ->
        ///rNo = rNo;
        this.name = name;
        this.marks = marks;
    }


    public Student(Student other) {
        this.rNo = other.rNo;
        this.name = other.name;
        this.marks = other.marks;
    }



    void greet() {
        System.out.println("Hey, This is " +  this.name);
    }


    void changeName(String newName) {
        name = newName;
    }


}

class StudentEx2 {
    int rNo;
    String name;
    float marks = 90f;
}
