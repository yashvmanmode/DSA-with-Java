public class firstOccurence {
    public static int first_Occcurence(int arr[], int key, int idx) {
        if(idx == 0){
            return -1;
        }
        
        if (arr[idx] == key){
            return idx;
        }

        return first_Occcurence(arr, key, idx-1);


    }
    public static void main(String[] args) {
        int arr[] = {5,5,5,5};
        int key = 5;
        int idx = arr.length-1;

        System.out.println(first_Occcurence(arr, key, idx) );

    }
}
