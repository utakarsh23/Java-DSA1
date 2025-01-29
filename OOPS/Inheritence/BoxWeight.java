package Inheritence;

public class BoxWeight extends Box { //extends is a prop of inheritance
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double len, double hei, double wid, double weight) {
        super(len, hei, wid); /// It calls the parent class constructor----
        this.weight = weight;
    }
}
