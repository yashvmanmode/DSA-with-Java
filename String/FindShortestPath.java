public class FindShortestPath {

    public static float find_Shortest_path(String path) {

        int x=0, y=0; 

        for (int i=0; i<path.length(); i++) {
            char direction = path.charAt(i);

            if (direction == 'N')
                y++;
            
            else if (direction == 'W')
                x--;

            else if (direction == 'E')
                x++;
            
            else
                y--;
        }
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path = "SSSSSSSSSSSSSSSSWWWWWWWWWWWWWW";
        System.out.println("the shortest path is: " + find_Shortest_path(path));
    }
}
