import java.util.*;

public class class1 {

    public static void Dimond_pattern(int n)  {
        //first Half
        for (int i=1; i<=n; i++) {
            //spaces 
            for (int j=1; j<=(n-i); j++)
                System.out.print("  ");

            //stars-(2i-1) times
            for (int j=1; j<=(2*i-1); j++)
                System.out.print("* ");

            System.out.println();
        }
        
        //second half
        for (int i=n; i>=1; i--) {
            //spaces
            for (int j=1; j<=(n-i); j++)
                System.out.print("  ");

            //stars-(2i-1) times
            for (int j=1; j<=(2*i-1); j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Dimond_pattern(n);
    }
}