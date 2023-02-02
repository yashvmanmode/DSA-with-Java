import java.util.*;
public class PairSum_2 {

    //Brute force O(n^2)
    public static boolean Pair_Sum2(ArrayList<Integer> arr, int target) {
        
        for (int i=0; i<arr.size(); i++) {
            for (int j=0; j<arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target)
                    return true;
            }
        }

        return false;
    }

    public static boolean pair_sum2_optimised(ArrayList<Integer> arr, int target) {
        int rightPtr = 0;
        int leftPtr = 0;
        int size = arr.size();

        for (int i=0; i<size; i++) {
            if (arr.get(i) > arr.get(i+1)){
                leftPtr = i+1;
                rightPtr = i;
                break;
            }
        }

        while (leftPtr != rightPtr) {
            int sum = arr.get(leftPtr) + arr.get(rightPtr);
            //case1
            if (sum == target)
                return true;
            
            else if (sum < target)
                leftPtr = (leftPtr-1)%size;

            else
                rightPtr = (size+rightPtr-1)%size;
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        
        int target = 14;

        System.out.println(pair_sum2_optimised(arr, target));
    }
}
