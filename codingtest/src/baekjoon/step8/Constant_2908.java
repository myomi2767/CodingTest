package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Constant_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String revResult = new String();
		int[] num = new int[2];
		for (int i = str.length()-1; i >= 0; i--) {
			revResult += str.charAt(i);
		}
		String[] rev = revResult.split(" ");
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(rev[i]);
		}
		if(num[0]>num[1]) {
			System.out.println(num[0]);
		}else {
			System.out.println(num[1]);
		}
	}

}
