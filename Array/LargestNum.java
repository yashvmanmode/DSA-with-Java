import java.util.*;

public class LargestNum {

    public static void Largest_Num(int array[], int n) {

        int largest  = Integer.MIN_VALUE;
        
        for (int i=0; i<n; i++) {
            if (array[i] > largest)
                largest = array[i];
        }

        System.out.println("largest number in array is: " + largest);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give a size of array: ");
        int n = sc.nextInt();

        System.out.println("give array; ");
        int array[] = new int[100];
        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        Largest_Num(array, n);
        
    }
}
