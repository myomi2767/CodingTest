/*package bk.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Group_1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int wordNum = Integer.parseInt(br.readLine());
		int count=0;
		for(int i=0;i<wordNum;i++) {
			String words = br.readLine();
			char[] word = words.toCharArray();
			for(int j=0;j<word.length;j++) {
				if(words.indexOf(word[j])==words.lastIndexOf(word[j])) {
					
				}else {
					for(int k=words.indexOf(word[j]);k<words.lastIndexOf(word[j]);k++) {
						if(word[k]==word[k+1]&k+1<words.lastIndexOf(word[j])) {
							
						}else {
							break;
						}
					}
					count--;
					break;
				}
			}
			count++;
		}
		System.out.println(count);
	}

}*/

package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Group_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int wordNum = Integer.parseInt(br.readLine());
		
		String[] words = new String[wordNum];
		boolean check = true;
		int[] count = new int[26];
 		int countWords = 0;
		
		for (int i = 0; i < wordNum; i++) {
			words[i] = br.readLine();
			Arrays.fill(count, 0);	//�ʱ�ȭ
			check = true;			//�ʱ�ȭ
			
			for(int j=0;j<words[i].length();j++) {				
				if(count[words[i].charAt(j) - 'a'] == 0) {					
					count[words[i].charAt(j)-'a']++;											
				} else {
					if(j > 0 && words[i].charAt(j) != words[i].charAt(j - 1)) {
						check = false;
						break;
					}
				}
			}
			
			if(check) countWords++;							
		}
		br.close();
		System.out.println(countWords);
	}
}

