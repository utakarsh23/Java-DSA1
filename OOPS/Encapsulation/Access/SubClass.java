package Encapsulation.Access;

public class SubClass extends A{
    public SubClass(int age, String name) {
        super(age, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Tripathi");
        int dob1 = obj.dob;
        /// i.e protected modifier can be accessed through a subClass(Same Package)

        System.out.println(obj instanceof A); // true as i is an instance of A as subClass is an instance of it so it indirectly is one
        System.out.println(obj instanceof SubClass); //true
    }
}
