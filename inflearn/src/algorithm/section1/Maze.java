package algorithm.section1;

public class Maze {
	private static int N = 8;
	private static int[][] maze = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0} // 1이 벽
	};
	private static final int PATHWAY_COLOR = 0; 	//white
	private static final int WALL_COLOR = 1; 		//blue
	private static final int BLOCKED_COLOR = 	2; 	//red
	private static final int PATH_COLOR = 3; 		//green
	
	public static boolean findPathMaze(int x, int y) {
		if( x<0 || y<0 || x>=N || y>=N) {
			return false;
		}else if(maze[x][y] != PATHWAY_COLOR) {
			return false;
		}else if(x==N-1 && y==N-1) {
			maze[x][y] = PATH_COLOR;
			return true;
		}else {
			maze[x][y] = PATH_COLOR;
			if(findPathMaze(x, y+1) || findPathMaze(x+1, y) || findPathMaze(x, y-1) || findPathMaze(x-1, y))
				return true;
			maze[x][y] = BLOCKED_COLOR;
			return false;
		}
	}
	
	private static void printMaze() {
	    for (int x = 0; x < N; x++) {
	      System.out.print("{");
	      for (int y = 0; y < N; y++)
	        System.out.print(maze[x][y] + ", ");
	      System.out.println("}");
	    }
	    System.out.println();
	  }
	
	public static void main(String[] args) {
		findPathMaze(0, 0);
	}
	
}
