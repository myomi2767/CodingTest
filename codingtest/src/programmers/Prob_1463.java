package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob_1463 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		if(num==1) System.out.println(0);
		else if(num<=3) System.out.println(1);
		else if(num==Math.pow(2, sqrtNum(num))||num==Math.pow(3, sqrtNum(num))) System.out.println(sqrtNum(num));
		else if(num-1==Math.pow(2,sqrtNum(num-1))||num-1==Math.pow(3,sqrtNum(num-1))) System.out.println(sqrtNum(num-1)+1);
		else {
			while(num!=1) {
				if(num%6==0) {
					num/=6;
					count += 2;
				}else if(num%3==0) {
					num /= 3;
					count++;
				}else if(num%3==1) {
					num -= 1;
					count++; 
				}else if(num%5>0&num%5<=2){
					num-=1;
					count++;
				}else {
					num/=2;
					count++;
				}
			}
			System.out.println(count);
		}
	}
	public static int sqrtNum(int num) {
		int count = 0;
		if(num%2==0) {
			while(num!=1) {
				num/=2;
				count++;
			}
		}else if(num%3==0){
			while(num!=1) {
				num/=3;
				count++;
			}
		}
		return count;
	}
}
