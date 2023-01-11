public class selectionSort {

    public static void selection_Sort(int arr[]) {

        for (int iter = 0; iter<arr.length-1; iter++) {

            int minPos = iter;
            for (int j=iter+1; j<arr.length; j++) {
                
                if (arr[minPos] > arr[j])
                    minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[iter];
            arr[iter] = temp;
        }
        
    }
    public static void Print_arr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        Print_arr(arr);
        selection_Sort(arr);
        System.out.print("The sorted array is :");
        Print_arr(arr);
    }
}
