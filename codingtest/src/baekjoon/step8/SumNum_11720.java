package baekjoon.step8;

import java.util.Scanner;

public class SumNum_11720 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int count = key.nextInt();
		String str = key.next();
		int sum = 0;
		if(str.length()==count) {
			for(int i=0;i<str.length();i++) {
				int num = (str.charAt(i) - '0');
				sum += num;
			}
		}
		System.out.println(sum);
		key.close();
	}
}
