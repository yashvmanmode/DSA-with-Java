//package Array;
import java.util.*;

public class LinearSearch {

    public static void Linear_Search(int array[], int n, int key) {
        
        for (int i=0; i<n; i++) {

            if (array[i] == key)
                System.out.println("the key was found on the index :" + i);
            else
                System.out.println("key not found");
        }
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100];
        System.out.print("enter size: ");
        int size = sc.nextInt();

        System.out.print("enter key: ");
        int key = sc.nextInt();

        System.out.println("enter array elements: ");
        for (int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }

        Linear_Search(array, size, key);
    }
}
