//AMAZON

public class TillingProblem {

    public static int Tilling_Problem(int n) {
        //Base Case
        if (n == 0 || n == 1)
            return 1;

        //Choices
        int verticle = Tilling_Problem(n-1);
        int horizontal = Tilling_Problem(n-2);

        int total_Tiling_ways = verticle + horizontal;
        return total_Tiling_ways;
        
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Tilling_Problem(n));
    }
}
