//Array assignment Q1

public class findDuplicates {

    public static boolean find_Duplicates(int nums[]) {

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) 
                    return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 6,};
        boolean flag = false;

        if (find_Duplicates(nums))
            System.out.println(true);
        else    
            System.out.println(false);
    }
}
