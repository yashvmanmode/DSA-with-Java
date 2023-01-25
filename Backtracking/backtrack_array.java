public class backtrack_array {

    public static void changeArrVal(int arr[], int idx, int val) {

        //base
        if (idx == arr.length){
            printArr(arr);
            return;
        }
        //recursive work
        arr[idx] = val;
        changeArrVal(arr, idx+1, val+1);
        arr[idx] = arr[idx]-2; //backtraking step
    }

    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[] = new int[10];
        changeArrVal(arr, 0, 1);
        printArr(arr);
    }
}
