package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] alpha = new int[26];
		int max = 0;
		char most = '?';
		for (int i=0;i<str.length();i++) {
			alpha[(str.charAt(i)-'A')]++;
			if(alpha[(str.charAt(i)-'A')]>max) {
				max = alpha[(str.charAt(i)-'A')];
				most = str.charAt(i);
			}else if(alpha[(str.charAt(i)-'A')]==max) {
				most = '?';
			}
		}
		System.out.println(most);
	}

}
