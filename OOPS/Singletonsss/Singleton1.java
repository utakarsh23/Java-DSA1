package Singletonsss;

public class Singleton1 {
    public static void main(String[] args) {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        Singleton obj3 = new Singleton();
        /// all 3 ref variables are pointing to just one
    }
}
