import java.util.Arrays;
public class Search_in_string {
    public static void main(String[] args) {
        String name = "Utkarsh"; //String
        char target = 's'; //Char
        System.out.println(search(name, target)); //by method 2, //true if exists, else false  
        ////////-------------
        System.out.println(Arrays.toString(name.toCharArray())); //by method 1, but we are converting elements into array of characters
        //[U, t, k, a, r, s, h]
        System.out.println(search1(name, target));  //true if exists, else false  
    }
    static boolean search(String name, char target) { //method 1 using for loop
        if(name.length() == 0) { //if string is empty then returning false
            return false;
        }
        for(int index = 0; index < name.length(); index ++) { //for each element(character) 
            if(target == name.charAt(index)) { //checking if it target exists in the string or not
                return true; //if yes then returning true 
            }
        }
        return false; //if none of the consition exists ie. the char does not exists in the string then returning false
    }
    static boolean search1(String name, char target) { //method 2 using enhanced for each loop
        if(name.length() == 0) { 
            return false;
        }
        for(char ch : name.toCharArray()) { //checking if it target exists in the string or not, using for each loop
            if(target == ch) {  //checking if it target exists in the string or not
                return true; //if yes then returning true 
            }
        }
        return false; //if none of the consition exists ie. the char does not exists in the string then returning false
    }
}