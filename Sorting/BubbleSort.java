public class BubbleSort {

    public static void Bubble_Sort(int arr[]) {

        for (int iter=0; iter<arr.length-1; iter++) {

            for (int j=0; j<arr.length-1-iter; j++) {

                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        int arr[] = {5, 4, 1, 3, 2};

        Print_arr(arr);
        Bubble_Sort(arr);
        System.out.print("The sorted array is : ");
        Print_arr(arr);
    }
}
