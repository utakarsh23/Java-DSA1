class StudentsN {
    public String name;
    StudentsN(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class app {
    public static void main(String[] args) {
        StudentsN[] arr = new StudentsN[] {new StudentsN("Shaurya"), new StudentsN("Dhruv"), new StudentsN("Ayush"), new StudentsN("Yashika"), new StudentsN("Sidharth")};
        for(StudentsN m:arr){
            System.out.println(m);
        }
    }
}
