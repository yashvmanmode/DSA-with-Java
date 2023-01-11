public class FactorialN {

    public static int factorial_N(int n) {

        if (n == 0) {
            return 1;
        }

        int Facto = n*factorial_N(n-1);
        return Facto;
        
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial_N(n));
    }
}
