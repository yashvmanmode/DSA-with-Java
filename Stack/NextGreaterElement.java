import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();

        int nxtGreater[] = new int[arr.length];

        for (int i=arr.length-1; i>=0; i--) {

            // Step 1: While loop for poping element 
            while (!s.isEmpty() && arr[s.peek()] <= arr[i])
                s.pop();

            // Step 2: if-else statement to add nextgreater into array
            if (s.isEmpty()) 
                nxtGreater[i] = -1;
            else 
                nxtGreater[i] = arr[s.peek()];
            

            // Step 3: Push in stack
            s.push(i);

        }

        for (int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }

    // VARIATIONS:
    // 1. nextGreaterRight: Current code 
    // 2. nextGreaterLeft: while (i=0 -> n-1) in line 10
    // 3. nextSmallerRight: arr[s.peek()] >= arr[i] at line 13
    // 4. nextSmallerLeft: variation 2 + variation 3 
}
