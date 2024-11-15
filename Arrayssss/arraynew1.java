public class arraynew1 {
    public static void main(String[] args) {
        int roll_no[] = {1, 2, 3, 4, 5}; //giving elements to the array
        String name[] = {"Shaurya", "Dhruv", "Ayush", "Yashika", "Sidharth"}; //giving elements to the array
        for(int i = 0; i < roll_no.length; i++) { //here i is taken for both the roll_no and name array so i = 0 targer the 0th      indexed element of both the arrays( 1 & Shaurya)
            //or
            // i just gives a loop which does not have any relation to the array other that it's condition(i< roll_no.length)
            System.out.println(roll_no[i] + " " + name[i]); 
        }
    }
}
