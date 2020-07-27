package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int[] num = new int[3];
		int day = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		if((num[2]-num[1])%(num[0]-num[1])!=0) {
			day = (num[2]-num[1])/(num[0]-num[1])+1;
			System.out.println(day);
		}else {
			day = (num[2]-num[1])/(num[0]-num[1]);
			System.out.println(day);
		}
	}

}
