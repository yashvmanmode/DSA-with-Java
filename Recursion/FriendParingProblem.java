public class FriendParingProblem {

    public static int Friend_Pairing(int n) {
        if (n == 1 || n == 2)
            return n;

        int total_ways = Friend_Pairing(n-1) + (n-1) * Friend_Pairing(n-2);
        return total_ways;
    }
    
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(Friend_Pairing(n));
    }
}
