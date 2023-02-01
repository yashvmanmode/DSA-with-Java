import java.util.ArrayList;

public class Pairsum {

    public static boolean Pair_Sum(ArrayList<Integer> arr, int target) {
        

        for (int i=0 ; i<arr.size()-1; i++) {
            for (int j=i+1; j<arr.size(); j++ ) {

                if (arr.get(i) + arr.get(j) == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean Pair_Sum_Optimised(ArrayList<Integer> arr, int target) {
        
        int leftPtr = 0;
        int rightPtr = arr.size()-1;

        while (leftPtr < rightPtr) {
            int pairSum = arr.get(leftPtr) + arr.get(rightPtr);
            if (pairSum == target)
                return true;

            else if (pairSum < target)
                leftPtr ++;

            else
                rightPtr--;
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        int target = 1872;

        System.out.println(Pair_Sum_Optimised(arr, target));
    }
}
