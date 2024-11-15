class Student {
    public String name;
    Student(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class app {
    public static void main(String[] args) {
        Student[] arr = new Student[] {new Student("Shaurya"), new Student("Dhruv"), new Student("Ayush"), new Student("Yashika"), new Student("Sidharth")};
        for(Student m:arr){    
            System.out.println(m);
        }
    }
}
