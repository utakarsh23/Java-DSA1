public class noo_count {
    public static void main(String[] args) {
        int n = 676758777;
        int w = 7;
        int count = 0;
        while(n>0) {
            int rem = n%10;
            if(rem == w) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
