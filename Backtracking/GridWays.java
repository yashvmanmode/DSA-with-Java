public class GridWays {

    public static int Grid_Way(int startRow, int startCol, int endRow, int endCol) {
        
        //base case
        if (startRow == endRow-1 && startCol == endCol-1)
            return 1;

        //corner case
        if (startCol == endCol || startRow == endRow) //startCol and startRow is out of boundary
            return 0;

        int way1 = Grid_Way(startRow+1, startCol, endRow, endCol);//down
        int way2 = Grid_Way(startRow, startCol+1, endRow, endCol);//right

        return way1+way2;
    }
    public static void main(String[] args) {
        int endRow=3 ,endCol=3;
        int startRow = 0, startCol = 0;

        System.out.println(Grid_Way(startRow, startCol, endRow, endCol));
    }
}
