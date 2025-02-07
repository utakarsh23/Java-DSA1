package Interfaces;

public class ELectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerates");
    }
}
