package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count=0;
		while(true) {
			if(num%5==0) {
				num -= 5;
			}else if(num%3==0) {
				num -= 3;
			}else if(num%5==3|num%5==1){
				num -= 5;
			}else if(num%3==2|num%3==1) {
				num -= 3;
			}else {
				num = -1;
			}
			count++;
			if(num==0) {
				System.out.println(count);
				break;
			}else if(num<0) {
				System.out.println(-1);
				break;
			}
		}
	}
}
