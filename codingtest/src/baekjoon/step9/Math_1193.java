package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		int check = num;
		
		int count = 1;
		int start = 0;
		int x = 0;
		int y = 0;
		
		while(true) {
			if(num<=1) {
				check -= start;
				break;
			}
			num -= (1+count);
			start += count;
			count++;
		}
		if(count%2==1) {
			y = count;
			for(int i=1;i<=count;i++) {
				x = i;
				if(check==i) {
					System.out.println(y+"/"+x);
				}
				y -= 1;
			}
		}else {
			y = count;
			for(int i=1;i<=count;i++) {
				x = i;
				if(check==i) {
					System.out.println(x+"/"+y);
				}
				y -= 1;
			}
		}
	}

}
