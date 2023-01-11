public class xPowerN {
    //Brute Force Approch: TC:- O(n)
    public static int X_PowerN(int x, int n) {

        if (n == 0)
            return 1;
        
        int ans = x * X_PowerN(x, n-1);
        return ans;
    }

    //Optimised Approch: TC:- O(log n)
    public static int X_PowerN_Optimised(int x, int n) {
        if (n == 0)
            return 1;

        int power = X_PowerN_Optimised(x, n/2);

        if (n%2 != 0) {
            return (x * power * power);
        }
        return (power * power);
        
    } 
    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        System.out.println(X_PowerN(x, n));
        System.out.println(X_PowerN_Optimised(x, n));
    }
}
