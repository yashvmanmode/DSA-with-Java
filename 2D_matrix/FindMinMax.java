//package 2D_matrix;
import java.util.*;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter no of coloums: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        System.out.println("Enter matrix elements: ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                max = Math.max(max, matrix[i][j]);
                min = Math.min(min, matrix[i][j]);
            }
        }

        System.out.println("The Max element is: " + max);
        System.out.println("The min element is: " + min);



    }
}
