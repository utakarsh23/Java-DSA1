package polyorphism;

public class ObjectPrint {

    int n;

    public ObjectPrint(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "n=" + n +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);

        System.out.println(obj);
    }
}
