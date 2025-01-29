package Inheritence;

public class Box {
    double len;
    double hei;
    double wid;

    Box() {
        this.len = -1;
        this.wid = -1;
        this.hei = -1;
    }

    Box(double side) {
        this.len = side;
        this.wid = side;
        this.hei = side;
    }

    Box(double len, double hei, double wid) {
        this.len = len;
        this.hei = hei;
        this.wid = wid;
    }

    Box(Box old) {
        this.len = old.len;
        this.hei = old.hei;
        this.wid = old.wid;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
