package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alpha_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		br.close();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
				case 'c':
					if(i<str.length()-1&&str.charAt(i+1)=='=') {
						i++;
						count++;
					}else if(i<str.length()-1&&str.charAt(i+1)=='-') {
						i++;
						count++;
					}else {
						count++;
					}
					break;
				case 'd':
					if(i<str.length()-2&&str.charAt(i+1)=='z'&str.charAt(i+2)=='=') {
						i+=2;
						count++;
					}else if(i<str.length()-1&&str.charAt(i+1)=='-') {
						i++;
						count++;
					}else {
						count++;
					}
					break;
				case 'l':case 'n':
					if(i<str.length()-1&&str.charAt(i+1)=='j') {
						i++;
						count++;
					}else {
						count++;
					}
					break;
				case 's':case 'z':
					if(i<str.length()-1&&str.charAt(i+1)=='=') {
						i++;
						count++;
					}else {
						count++;
					}
					break;
				default:
					count++;
					break;
			}
		}
		System.out.print(count);
		
	}

}
