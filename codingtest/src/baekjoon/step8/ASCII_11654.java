package baekjoon.step8;

import java.util.Scanner;

public class ASCII_11654 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("ASCII�ڵ� ��ȯ �����Է�:");
		
		String str= key.next();
		byte[] ASCII = str.getBytes();
		System.out.println("ASCII�ڵ� ����:"+ASCII[0]);
		key.close();
	}

}
