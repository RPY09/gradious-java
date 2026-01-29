public class maze {
    public static void main(String[] args) {
     

        int maze[][] = {
            { 1, 1, 0, 1 },
            { 1, 0, 0, 1 },
            { 1, 0, 1, 0 },
            { 1, 1, 1, 1 },
        };
        boolean reached[] = { false };
        ratTravel(0, 0, maze, reached);
        System.out.println(reached[0]);
    }


    static void ratTravel(int x, int y, int maze[][], boolean reached[]) {
        int rows = maze.length;
        int cols = maze[0].length;
        if (x == rows - 1 && y == cols - 1) {
            reached[0] = true;
            System.out.println(x+","+y);
            return;
        }

        // move right
        if (x < rows && y + 1 < cols && maze[x][y + 1] != 0) {
            System.out.println(x+","+y);
            ratTravel(x, y + 1, maze, reached);
        }

        // move down
        if (x + 1 < rows && y < cols && maze[x + 1][y] != 0) {
            System.out.println(x+","+y);
            ratTravel(x + 1, y, maze, reached);
        }
    }
}
