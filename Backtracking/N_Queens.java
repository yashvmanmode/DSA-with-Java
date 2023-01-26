public class N_Queens {

    public static boolean isSafe(char ChessBoard[][], int row, int col) {
        //Check above
        for (int i=row-1; i>=0; i--){
            if (ChessBoard[i][col] == 'Q')
                return false;
        }

        //Check left Diagonal
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if (ChessBoard[i][j] == 'Q')
                return false;
        }

        //Check Right Diagonal
        for (int i=row-1, j=col+1; i>=0 && j<ChessBoard.length; i--, j++){
            if (ChessBoard[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void N_Queens_problem(char ChessBoard[][], int startRow) {
        if (startRow == ChessBoard.length) {
            print(ChessBoard);
            return;
        }

        for (int i=0; i<ChessBoard.length; i++) {

            if (isSafe(ChessBoard, startRow, i)){
                ChessBoard[startRow][i] = 'Q';
                N_Queens_problem(ChessBoard, startRow+1);
                ChessBoard[startRow][i] = '_';
            }
        }
    }

    public static void print(char ChessBoard[][]) {
        System.out.println();
        for(int i=0; i<ChessBoard.length; i++) {
            for (int j=0; j<ChessBoard.length; j++) {
                System.out.print(ChessBoard[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = 4;
        char ChessBoard[][] = new char[n][n];

        //initialisation
        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                ChessBoard[i][j] = '_';
            }
        }

        // print(ChessBoard, n);
        N_Queens_problem(ChessBoard, 0);
        
    }
}
