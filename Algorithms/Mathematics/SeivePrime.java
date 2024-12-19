package Mathematics;
//O(N*log(log(N)))
public class SeivePrime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n+1];
        isPrimeSeive(n, arr);
    }
    static void isPrimeSeive(int n, boolean[] arr) {
        for (int i = 2; i*i <= n; i++) {
            if(!arr[i]) {
                for (int j = i*2; j < n; j+=i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(!arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
