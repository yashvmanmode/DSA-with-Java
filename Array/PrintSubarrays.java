//the Maximum subarray sum problem is also solved here
//Maximum subarray problem - print the sum of the subarray whose sum is max

public class PrintSubarrays {
    public static void print_Subarrays(int arr[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++) {
            
            for (int j=i; j<arr.length; j++) {

                int sum = 0;
                for (int k=i; k<=j; k++) {

                    sum = sum + arr[k];
                    max = Integer.max(max, sum);
                    min = Integer.min(min, sum);

                    System.out.print( arr[k] + " ");
                }
                System.out.print("- Sum : " + sum);
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("the Max Sum is :" + max);
        System.out.println("The Min Sum is :" + min);
        
    }
    
    public static void main(String[] args) {
        int arr[] = {7, 2, 6, 3, 6};

        print_Subarrays(arr);
    }
}
