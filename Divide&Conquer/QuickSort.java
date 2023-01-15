public class QuickSort {

    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int Partition(int arr[], int start, int end) {

        int pivot = arr[end];
        int i = start-1;

        for (int j=start; j<end; j++) {

            if (arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // To Place pivot on the right place
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void Quick_Sort(int arr[], int start, int end) {

        if (start >= end)
            return;

        int Pivot_idx = Partition(arr, start, end);
        Quick_Sort(arr, start, Pivot_idx-1); //Left part
        Quick_Sort(arr, Pivot_idx+1, end); //right part
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,-1,8};
        Quick_Sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
