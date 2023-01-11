import java.util.*;
public class Kadanes_algo {

    public static int Max_SubarraySum(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            currSum+=arr[i];
            if (currSum < 0)
                currSum = 0;

            maxSum = Integer.max(maxSum, currSum);
        }
        
        if (maxSum == 0) {
            int max = Integer.MIN_VALUE;
            for (int i=0; i<arr.length; i++) {
                max = Integer.max(max, arr[i]);
            }

            return max;
        } else {
            return maxSum;
        }
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3, 4, -1,-2, 1, 5, -3 };
        int arr2[] = {-1, -2, -3, -4};

        System.out.println(Max_SubarraySum(arr2)); 
    }
}

// one corner case left written in notes. refer that
