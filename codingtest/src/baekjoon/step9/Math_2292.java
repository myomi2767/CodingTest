package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		int count = 1;
		while(true) {
			if(num<=1) {
				System.out.println(count);
				break;
			}
			num -= 6*count;
			count++;
		}
	}

}
