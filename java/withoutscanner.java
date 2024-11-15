public class withoutscanner {
    public static void main(String[] args) { //(i) = serial wise steps that prog follows
        int summation = sums(3, 4); //storing sum value in summation (4) & giving a val 3 & b val 4
        System.out.println(summation); //execution (5)
    }
    static int sums(int a, int b) { //a & b are input type without scanner (1)
        int sum = a+b; //a + b (2)
        return sum; //returning the sum (3)
    }
}
