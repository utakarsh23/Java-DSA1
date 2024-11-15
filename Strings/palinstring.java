public class palinstring {

    public static void main(String[] args) {
        //reversing the string to check if it is a palindrome by comparing them
        String w = "aplpa"; 
        String rev = ""; //initialising a variable to store the reverse of the string
        for(int i = 0; i< w.length(); i++) { //loop for reversing the string
            char ch = w.charAt(w.length()-i-1); //getting the character from the end of the string w.length - i - 1 = 5-0-1 = 4, 5-1-1 = 3, 5-2-1 = 2, 5-3-1 = 1, 5-4-1 = 0
            rev = rev + ch; //rev = "" + ch(ch is the character at the end of the string); ch + ch(last second character); ch + ch + ch(last third character) and so on....... which will give a string 'rev' in reverse order of the string 'w'
        }
        System.out.println(rev);
        if(w.equals(rev)) { //comparing the original string with the reverse string
            System.out.println(w + " is a palindrome"); //printing if the string is a palindrome
        } else {
            System.out.println(w + "is not a palindrome"); //printing if the string is not a palindrome
        }
    }
}
