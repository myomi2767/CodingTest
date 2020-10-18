package programmers.stack;

import java.util.*;

public class Level2_stock {
	public static void main(String[] args) {
		Solu_stock sol = new Solu_stock();
		int[] prices = {1, 2, 3, 2, 3};
		sol.solu_for(prices);
	}
}

class Solu_stock {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<int[]>();
        
        for(int i = prices.length - 2 ; i >= 0 ; i--){
            if(prices[i] >= prices[i+1]){
                answer[i] = 1;
                stack.push(new int[] { prices[i+1], i+1 });
            }else{
                while(stack.size() > 0 && stack.peek()[0] >= prices[i]){
                    stack.pop();
                }
                
                if(stack.size()==0){
                    answer[i] = prices.length - i - 1;
                }else{
                    answer[i] = stack.peek()[1] - i;
                }
            }
        }
        //System.out.println(answer);
        return answer;
        
    }
    public int[] solu_for(int[] prices) {
    	int[] result = new int[prices.length];
    	
    	for(int i=0;i<prices.length;i++) {
    		for(int j=i+1;j<prices.length;j++) {
    			if(prices[i]>prices[j]) {
    				result[i] = j - i;
    				break;
    			}
    			result[i] = j - i;
    		}
    	}
    	System.out.println(Arrays.toString(result));
    	return result;
    }
}
