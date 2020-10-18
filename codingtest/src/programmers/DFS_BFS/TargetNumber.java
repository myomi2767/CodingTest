// 타겟 넘버
package programmers.DFS_BFS;

public class TargetNumber {
	public static void main(String[] args) {
		Solution_target sol = new Solution_target();
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		sol.solution(numbers, target);
	}
}

class Solution_target {
    private static int count;
    
    public int solution(int[] numbers, int target) {
        int[] sign = new int[numbers.length];
        count = 0;
        targetNum(numbers, sign, 0, numbers.length, target);

        return count;
    }
    
    public static void targetNum(int[] numbers, int[] sign, int idx, int end, int target){
        if(idx == end){
            int result = 0;
            for(int i = 0 ; i<numbers.length; i++){
                result += numbers[i] * sign[i];
            }
            
            if(target==result){
                count++;
            }
            return;
        }
        
        sign[idx] = 1;
        targetNum(numbers, sign, idx + 1, end, target);
        
        sign[idx] = -1;
        targetNum(numbers, sign, idx + 1, end, target); 
    }
}
