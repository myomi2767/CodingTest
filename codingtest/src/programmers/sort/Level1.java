package programmers.sort;

import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		Solution_lv1 sol = new Solution_lv1();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		sol.solution(array, commands);
	}
}

class Solution_lv1 {
    public int[] solution(int[] array, int[][] commands) {
    	
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int[] result = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(result);
            answer[i] = result[commands[i][2]-1];
        }
        
        return answer;
    }
}
