package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_1712 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String variable = br.readLine();
		br.close();
		
		int[] cost = new int[3];
		int breakEvenPoint = -1;
		StringTokenizer st = new StringTokenizer(variable);
		cost[0]=Integer.parseInt(st.nextToken());
		cost[1]=Integer.parseInt(st.nextToken());
		cost[2]=Integer.parseInt(st.nextToken());
		if(cost[1]<cost[2]) {
			breakEvenPoint = cost[0]/(cost[2]-cost[1])+1;
		} else {
			breakEvenPoint = -1;
		}
		System.out.println(breakEvenPoint);
	}
}
