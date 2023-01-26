public class N_Queens {

    public static void N_Queens_problem(char ChessBoard[][], int startRow) {
        if (startRow == ChessBoard.length) {
            print(ChessBoard);
            return;
        }

        for (int i=0; i<ChessBoard.length; i++) {
            ChessBoard[startRow][i] = 'Q';
            N_Queens_problem(ChessBoard, startRow+1);
            System.out.println();
            ChessBoard[startRow][i] = '_';
        }
    }

    public static void print(char ChessBoard[][]) {

        for(int i=0; i<ChessBoard.length; i++) {
            for (int j=0; j<ChessBoard.length; j++) {
                System.out.print(ChessBoard[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = 2;
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
