public class countingSort {

    public static void Counting_Sort(int arr[]) {

        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        //array to store frequency
        int freq[] = new int[max+1];
        for (int i=0; i<arr.length; i++) {
            freq[arr[i]]++;
        }

        int j=0; 
        for (int i=0; i<freq.length; i++){
            while (freq[i]>0){
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
    }

    public static void Print_arr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        Print_arr(arr);
        Counting_Sort(arr);
        System.out.print("The sorted array is :");
        Print_arr(arr);
    }
    
}
