package algorithm.section1;

public class Blob {
	private static int N = 8;
	private static int[][] cell = {
			{1, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 0, 1, 0, 0},
			{1, 1, 0, 0, 1, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 0},
			{1, 0, 0, 0, 1, 0, 0, 1},
			{0, 1, 1, 0, 0, 1, 1, 1} // 1이 벽
	};
	
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COUNTED = 2;
	
	private int countCells(int x, int y) {
		if(x<0 || y<0 || x>=N || y>=N ) {
			return 0;
		}else if(cell[x][y] != IMAGE_COLOR) {
			return 0;
		}else {
			cell[x][y] = ALREADY_COUNTED;
			return 1 + countCells(x - 1, y) + countCells(x - 1, y + 1) + countCells(x, y + 1) + countCells(x + 1, y + 1)
			+ countCells(x + 1, y) + countCells(x + 1, y - 1) + countCells(x, y - 1) + countCells(x - 1, y - 1);
		}
	}
	
	
	public static void main(String[] args) {
		Blob b = new Blob();
		System.out.println(b.countCells(5,3));
	}

}
