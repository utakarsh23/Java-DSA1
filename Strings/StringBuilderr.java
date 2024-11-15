public class StringBuilderr {
    public static void main(String[] args) {
        StringBuilder svsa = new StringBuilder("aaaaa");
        System.out.println(svsa);
        svsa = svsa.append(" bbbbb"); //append/ add to the string
        System.out.println(svsa.toString());
        svsa = svsa.insert(1, "cccc"); //insert/ add to the string at a particular index
        System.out.println(svsa);
        svsa = svsa.replace(1, 3, "apps"); //replace/ change the string from in a particular index 
        System.out.println(svsa);
        svsa = svsa.delete(1,3); //delete/ remove the string from a particular index
        System.out.println(svsa);
        svsa = svsa.reverse(); //reverse/ reverse the string
        System.out.println(svsa);
        System.out.println(svsa.length()); //length/ length of the string
    }
}
