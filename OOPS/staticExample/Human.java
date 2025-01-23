package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    /// this static variable are not dependent on any other object of the class Human(in this case) --ref in the Main(1.1)
    static int population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}
