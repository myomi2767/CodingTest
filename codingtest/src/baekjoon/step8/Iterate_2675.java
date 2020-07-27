package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iterate_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			String[] str = br.readLine().split(" ");
			char[] c = str[1].toCharArray();
			StringBuilder sb = new StringBuilder();
			
			for(int j=0;j<c.length;j++) {
				for(int i=0;i<Integer.parseInt(str[0]);i++) {
					sb.append(c[j]);
				}
			}
			System.out.println(sb.toString());
		}
		br.close();
	}
}
