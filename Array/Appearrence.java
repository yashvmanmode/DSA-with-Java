public class Appearrence {
    //It shows error when i=n ans j tries to allocate n+1
    public static boolean BruteForce_appearence(int arr[]) {

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {

                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7};

        System.out.println(BruteForce_appearence(arr)); 
    }
}
