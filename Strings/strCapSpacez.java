
public class strCapSpacez {
    public static void main(String[] args) {
        String ss = "icodeinpython";
        int[] arr = {1,5,7,9};
        System.out.println(hehe(ss, arr));
    }
    static String hehe(String str, int[] spaces) {

        int l =0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i < spaces.length; i++) {
            int space = spaces[l] + i;
            sb.insert(space, " ");
            l += 1;
        }
        return sb.toString();
    }
}
