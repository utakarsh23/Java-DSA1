public class StringBufferw {
    public static void main(String[] args) {
        StringBuffer svs = new StringBuffer("aaaaa");
        System.out.println(svs);
        svs = svs.append(" bbbbb"); //append/ add to the string
        System.out.println(svs.toString());
        svs = svs.insert(1, "cccc"); //insert/ add to the string at a particular index
        System.out.println(svs);
        svs = svs.replace(1, 3, "apps"); //replace/ change the string from in a particular index 
        System.out.println(svs);
        svs = svs.delete(1,3); //delete/ remove the string from a particular index
        System.out.println(svs);
        svs = svs.reverse(); //reverse/ reverse the string
        System.out.println(svs);
        System.out.println(svs.length()); //length/ length of the string
    }
}