// NOT COMPLETE

public class find_target {

    public static int binarySearch(int nums[], int start, int end, int key) {
       
        while (start < end) {
            int mid = (start+end)/2;
            
            if (key == nums[mid]){
                return mid;
            }

            else if (key > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void findTarget(int nums[], int key) {
        int start = 0;
        int end = nums.length-1;

        int mid = (start+end)/2;

        if (key == nums[mid]){
            System.out.println(mid);
        }
        else if (nums[mid] > nums[mid+1]) {
            start = mid+1;
            System.out.println(binarySearch(nums, start, end, key));
        }
        else {
            end = mid-1;
            System.out.println(binarySearch(nums, start, end, key));
        }
        
    }
    
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 4;

        findTarget(nums, target);
    }
}
