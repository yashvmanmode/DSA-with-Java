public class Print_n {

    public static void printN(int n) {
        
        //Base Case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printN(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printN(n);
    }
}
