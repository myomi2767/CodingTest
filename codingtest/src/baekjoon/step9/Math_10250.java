package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			StringBuilder sb = new StringBuilder();
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			if((N/H)+1<10) {
				if(N%H==0) {
					sb.append(H);
					sb.append(0);
					sb.append((N/H));
				}else {
					sb.append(N%H);
					sb.append(0);
					sb.append((N/H)+1);
				}
			} else {
				if(N%H==0) {
					sb.append(H);
					sb.append((N/H));
				}else {
					sb.append(N%H);
					sb.append((N/H)+1);
				}
			}
			System.out.println(sb);
			
		}
	}

}
