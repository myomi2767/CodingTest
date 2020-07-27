package baekjoon.step8;

import java.util.Scanner;

public class Search_10809 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String str = key.next();
		
		for(char c='a';c<='z';c++) {
			System.out.print(str.indexOf(c)+" ");
		}
		key.close();
	}
}
