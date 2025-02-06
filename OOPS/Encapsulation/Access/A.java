package Encapsulation.Access;

public class A {
    private int age; /// it is private so we can't basically access it anywhere except for this file -----(1)

    String name; /// default access modifier as it has no prefix such as public or private, it can be accessed here
    /// in the file in the same file directory but can't be accesed through another -----(2)

    public int[] arr; /// can be acccesed from anywhere any place as it's public,(same as getters and setters)


    protected int dob; ///can be accesed from within the directory(package) but not from outside, same as default ----(3)


    public int getAge() { /// but this is public and can be accessed anywhere in the directory ------(1)
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public A(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[age];
        this.dob = age+2;
    }
}
