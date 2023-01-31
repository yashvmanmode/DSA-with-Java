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

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        int target = 727;

        System.out.println(Pair_Sum(arr, target));
    }
}
