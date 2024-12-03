public class strCapSpace {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("HelloWorldLol");
        hehe(str);
        System.out.println(hehe(str));
    }
    static String hehe(StringBuffer sb) {

            for(int i = 1; i < sb.length(); i++) {
                if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                    sb.insert(i, " ");
                    i +=1;
                }
            }

        return sb.toString();
    }
}
