import java.util.Arrays;

class Studentss { //a mew func
    public String name; //public usable variable
    public int roll_no; //ditto
    public Studentss(int roll_no, String name) { //constructor for two variables name and roll_no
        this.roll_no = roll_no; //this is used to refer to the name and roll_no of the constructor not the public ones, 
                                 //ie. this.roll_no(constructor) = roll_no(public)
        this.name = name;
    }
}
public class arraynew { //execution class
    public static void main(String[] args) {
    Studentss[] arr = new Studentss[5]; //initialising length of array to 5
    arr[0] = new Studentss(1, "Shaurya"); //initialising values of the array
    arr[1] = new Studentss(2, "Dhruv");
    arr[2] = new Studentss(3, "Ayush");
    arr[3] = new Studentss(4, "Yashika");
    arr[4] = new Studentss(5, "Sidharth");
        for (Studentss arr1 : arr) { //for(int i = 0; i < arr.length; i++)
            System.out.println(arr1.roll_no + " " + arr1.name);
        }
    }
}
