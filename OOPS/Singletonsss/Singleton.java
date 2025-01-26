package Singletonsss;

/// Singletonsss.Singleton is a class which can have only one object...
public class Singleton {

    public Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
