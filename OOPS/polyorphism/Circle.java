package polyorphism;

public class Circle extends Shapes {
    @Override
    void area() {
        System.out.println("Area is 3.14 times square of radius");
    }
}
