package Mathematics;

public class NoOdDigInBin {
    public static void main(String[] args) {
        System.out.println(noOfDig(10, 2));
    }
    static int noOfDig(int num, int base) {
        return  (int)((Math.log(num)/Math.log(base)) +1);
        //Log(num)base(2)+1
    }
}
