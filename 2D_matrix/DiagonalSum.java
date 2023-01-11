public class DiagonalSum {
    public static void Diagonal_Sum(int matrix[][]) {
        
        int sum = 0;

        //BRUTE FORCE APPROCH - TC:O(n^2)
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0]. length; j++) {

                if (i == j)
                    sum += matrix[i][j];

                else if (i+j == matrix.length-1)
                    sum += matrix[i][j];
            }
        }
        System.out.println("Brute Force approch sum: " + sum);
        

        //OPTIMISED APPROCH - TC:O(n)
        int sum2 = 0;
        for (int i=0; i<matrix.length; i++){
            //Primary diagonal
            sum2 += matrix[i][i];

            //Secondary diagonal
            //(i+j = n-1) that is (j = n-i-1)
            if (i != matrix.length-i-1)//because we dont want to sum the overlapping cell in odd case
                sum2 += matrix[i][matrix.length-i-1];

        }
        System.out.println("optimised approch sum: " + sum2);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, 
                            {5, 6, 7, 8}, 
                            {9, 10, 11, 12}, 
                            {13, 14, 15, 16}};

        int matrix2[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("EVEN CASE");
        Diagonal_Sum(matrix);
        System.out.println();
        System.out.println("ODD CASE");
        Diagonal_Sum(matrix2);
    }
}
