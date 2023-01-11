public class SpiralMatrixPrint {

    public static void spiral_Matrix_Print(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        
        while(startRow <= endRow && startCol <= endCol) {

            //TOP BOUNDARY
            for (int i=startCol; i<=endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            //RIGHT BOUNDARY
            for (int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //BOTTOM BOUNDARY
            for (int i=endCol-1; i>=startCol; i-- ){
                if (startCol == endCol)
                    break;
                
                System.out.print(matrix[endRow][i] + " ");
            }

            //LEFT BOUNDARY

            for (int i=endRow-1; i>=startRow+1; i--){
                if (startRow == endRow)
                    break;
                
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++; endRow--;startCol++; endCol--; 
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, 
                            {5, 6, 7, 8}, 
                            {9, 10, 11, 12}, 
                            {13, 14, 15, 16}};

        spiral_Matrix_Print(matrix);
    }
}
