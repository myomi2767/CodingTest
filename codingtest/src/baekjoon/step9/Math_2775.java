package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[15][14];
		for(int j=0;j<14;j++) {
			arr[0][j] = j+1;
			arr[j+1][0] = 1;
		}
		for(int j=1;j<15;j++) {
			for(int t=1;t<14;t++) {
				arr[j][t] += arr[j][t-1] + arr[j-1][t];
			}
		}
		
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(arr[k][n-1]);
		}
	}
}
