public class Search_RotatedArray {

    public static int search_RotatedArray(int arr[], int target, int start, int end) {
        
        int mid = start + (end - start)/2;

        // Base Case
        if (start > end)
            return -1;

        // Found at Mid             
        if (arr[mid] == target)
            return mid;

        // Mid on L1
        else if (arr[start] <= arr[mid]){

            if (arr[start] <= target && target <= arr[mid])
                return search_RotatedArray(arr, target, start, mid-1);
            else    
                return search_RotatedArray(arr, target, mid+1, end);
        }
        // Mid on L2
        else {

            if (arr[mid] <= target && target <= arr[end])
                return search_RotatedArray(arr, target, mid+1, end);
            else    
                return search_RotatedArray(arr, target, start, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 4;

        int target_idx = search_RotatedArray(arr, target, 0, arr.length-1);
        System.out.println(target_idx);
    }
}
