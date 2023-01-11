public class oddEven {

    public static void Odd_Even(int n ) {
        int bitMask = 1;

        if ((n & bitMask) == 0)
            System.out.println("even no");
        else 
            System.out.println("odd no");
    }
    
    public static void main(String[] args) {
        int n = 6;
        Odd_Even(n);
    }
}