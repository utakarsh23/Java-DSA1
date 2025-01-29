package Inheritence;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.len + " " + box.wid + " " + box.hei);
//
//        Box box4 = new Box(4);
//        System.out.println(box4.len + " " + box4.wid + " " + box4.hei);
//
//        Box inBox = new Box(box4);
//        System.out.println(inBox.len + " " + inBox.wid + " " + inBox.hei);

        /// /////////

//        BoxWeight boxWeight1 = new BoxWeight();
//        System.out.println(boxWeight1.len + " " + boxWeight1.wid + " " + boxWeight1.hei + " " + boxWeight1.weight);
//
//        BoxWeight boxWeight = new BoxWeight(1, 2, 3, 4);
//        System.out.println(boxWeight.len + " " + boxWeight.wid + " " + boxWeight.hei + " " + boxWeight.weight);



        Box boxAndWeight = new BoxWeight(3, 4, 5, 6);
///        jere we can not access 'boxAndWeight.weight' as the
        System.out.println(boxAndWeight.len + " " + boxAndWeight.wid + " " + boxAndWeight.hei);

    }
}
