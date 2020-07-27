package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		br.close();
		if(line.isEmpty()) {
			System.out.println("0");
		}else {
			System.out.print(line.split(" ").length);
		}
	}

}
