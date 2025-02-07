package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine myCar = new Car();
//
////        myCar.a;
//        myCar.acc();
//        myCar.start();
//        myCar.stop();
////        myCar.brake(); //can't be accesed cause Engine does not have brake;
//
//        Media carMedia = new Car();
//        carMedia.stop();


        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
