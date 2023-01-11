public class isSorted {

    public static boolean is_Sorted(int arr[], int i) {

        if (i == arr.length-1)
            return true;

        if (arr[i] > arr[i+1])
            return false;

        return is_Sorted(arr, i+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,3,5,6};
        int i = 0;

        System.out.println(is_Sorted(arr, i));
    }
}
