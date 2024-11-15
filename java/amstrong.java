public class amstrong {
    public static void main(String[] args) {
        for(int i = 100; i<=999; i++) { //from 100 to 999
            if(arms(i)) { //checking if num between 99 to 1000 is armstrong with the help of func
                System.out.print(i + " "); //printing armstrong
            }
        }
    }
    static boolean arms(int n){ //returns true if armstrong ... i.e: taking 15
        int temp = n; //storing n in temp so the initial value of n(15) can be compared
        int sum = 0; //starting a loop to get the sum of cubes of digits
        while(n>0) { //
            int rem = n%10; //getting the last digit ::: (15%10 = 5)
            n = n/10; //removing the last digit ::: (15/10 = 1)
            sum = sum + rem*rem*rem; //sum of cubes of digits ::: (0 + 5*5*5 = 125), then (125 + 1*1*1 = 126)
        }
        return sum == temp; // if sum(condition for armstrong) == temp(initial value of n) then it is an armstrong number
    }
}
