public class appl {
    public static void main(String[] args) {
        String s = "apps";
        String p = " mac";
        String t = " mac";
        int count = 0;
        String ss = s + p + t;
        System.out.println(ss); //addition of String
        for(int i = 0; i< ss.length(); i++) { //loop for printing all elements and their index
           if(i%2!=0) { //oops, printing only odd indexes
            System.out.print(i + "-"); //index printing
            System.out.print(ss.charAt(i) + " "); //element at index printing 
           } 
           if(ss.charAt(i) == 'a') { //finding frequency of character a in String ss
            count++; //incrementing count as the char is found in the String 
           }
        }
        System.out.println(); //space
        System.out.println("Frequency of the character 'a' : " + count); //the freq of the element in the String we want to find 
        System.out.println("Length of the String : " +ss.length()); //printing length of the ss
        System.out.println("Character at index '9' in String ss is : " + ss.charAt(9)); //printing the element at index 9(m) in ss
        //to print the string in reverse order
        String w = ""; //initialisinga variable 'w'
        for(int k = 0; k< ss.length(); k++) { //loop
            char ch = ss.charAt(ss.length()-k-1); //getting the character from the end of the string
            //to get index ss.length(12) - k(0) - 1 = 11, ss.length(12) - k(1) - 1 = 10
            w = w + ch; //w = "" + ch(ch is the character at the end of the string); ch + ch(last second character); ch + ch + ch(last third character) and so on....... which will give a string 'w' in reverse order of the string 'ss'
        } 
        System.out.println("Reverse of String ss : '" + w + "'"); //printing the string w(reverse of ss)
    }
}