public class fibonacci {

    public static int Fibonacci_N(int n) {

        if (n == 0 || n == 1)
            return n;

        int fibo = Fibonacci_N(n-1) + Fibonacci_N(n-2);
        return fibo;
        
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println(Fibonacci_N(n));
    }
}
