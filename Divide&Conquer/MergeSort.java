public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp array

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]){
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }
            k++;
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= end)
            temp[k++] = arr[j++];

        for (i = start, k = 0; k<temp.length; k++, i++)
            arr[i] = temp[k];
    }

    public static void Merge_Sort(int arr[], int start, int end) {
        if (start >= end)
            return ;

        int mid = start + (end - start)/2;
        Merge_Sort(arr, start, mid);
        Merge_Sort(arr, mid+1, end);

        Merge(arr, start, mid, end);
    }



    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,-1,8};
        Merge_Sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
