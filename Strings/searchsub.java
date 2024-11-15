
public class searchsub {
    public static void main(String[] args) {
        String s = "I wanna eat burger";
        System.out.println(s.contains("wanna")); //checking if the substring is present in the string
        System.out.println(s.contains("burger")); //true
        System.out.println(s.contains("hiee")); //false
        if(s.contains("eat")) {
            System.out.println("Substring is present in the string");
            System.out.println(s.indexOf("eat"));
            System.out.println(s.substring(0, s.indexOf("eat")));
            String t = s.substring(0, s.indexOf("eat"));
            int count = 0;
            for(int i = 0; i< t.length(); i++) {
                if(t.charAt(i) == ' ') { //finding frequency of character a in String ss
                    count++; //incrementing count as the char is found in the String 
                   }
            }
            System.out.println(count+1);
        }
    }
}
