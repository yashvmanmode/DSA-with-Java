public class N_sum {

    public static int Nsum(int n) {

        if (n == 1) {
            return 1;
        }

        int sum = n+Nsum(n-1);
        return sum;
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Nsum(n));
    }
}
