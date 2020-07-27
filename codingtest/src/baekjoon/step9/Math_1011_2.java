package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_1011_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			long x = Integer.parseInt(st.nextToken());
			long y = Integer.parseInt(st.nextToken());
			
			long length = y-x;
			long n = 0;
			long count = 0;
			while(true) {
				n++;
				if((n*n-n+1)<=length&&(n*n)>=length) {
					count = 2*n - 1;
					break;
				}else if((n*n+1)<=length&&(n*n+n)>=length){
					count = 2*n;
					break;
				}
			}
			System.out.println(count);
		}
		br.close();
	}

}
