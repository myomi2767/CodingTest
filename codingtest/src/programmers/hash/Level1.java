package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Level1 {
	public static void main(String[] args) {
		Solu_lv1 lv1 = new Solu_lv1();
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		lv1.solution(participant, completion);
	}
}

class Solu_lv1 {
    public String solution(String[] participant, String[] completion) {
    	String answer = "";
    	HashMap<String, Integer> result = new HashMap<>();
    	// 일반적인 for 문
//    	for(int i=0;i<participant.length;i++) {
//    		result.put(participant[i], result.getOrDefault(participant[i], 0) + 1);
//    	}
//    	for(int i=0;i<completion.length;i++) {
//    		result.put(completion[i], result.get(completion[i]) - 1);
//    	}
    	// 향상된 for 문
    	for(String part : participant) {
    		result.put(part, result.getOrDefault(part, 0) + 1);
    	}
    	
    	for(String comp : completion) {
    		result.put(comp, result.get(comp) - 1);
    	}
    	
    	for(Entry<String, Integer> entry : result.entrySet()) {
    		if(entry.getValue()!=0) {
    			answer = entry.getKey();
    			break;
    		}
    	}
    	System.out.println(answer);
        return answer;
    }
    // 또 다른 방법
    public String solution_sort(String[] participant, String[] completion) {
    	String result = "";
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	
    	int i = 0;
    	while(i<completion.length) {
    		if(!participant[i].equals(completion[i])) {
    			result = participant[i];
    			return result;
    		}
    		i++;
    	}
    	
    	return participant[i];
    }
}

