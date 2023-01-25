public class N_Queens {

    public static void N_Queens_problem(char ChessBoard[][], int startRow) {
        
    }

    public static void print(char ChessBoard[][], int n) {

        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(ChessBoard[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = 12;
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
