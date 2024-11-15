public class palinstring1 {
    public static String s = "madam"; //initialising a string for whole class
    public static void main(String[] args) {
        if(palin()) { //calling the function to check if the string is palindrome or not
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
    public static boolean palin() { //A FUNCTION TO CHECK IF THE STRING IS PALINDROME OR NOT
       for(int i = 0; i< s.length()/2; i++) { //loop for checking the string is palindrome or not
            if(s.charAt(i) != (s.charAt(s.length()-i-1))) { //checking if the character at the start of the string is equal to the character at the end of the string
                return false; //returning false if the string is not palindrome
            } 
        } 
        return true;    //returning true if the string is palindrome
    }
}
