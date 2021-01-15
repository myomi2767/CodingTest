package algorithm.section1;
//멱집합 구하는 재귀함수
public class PowerSetExam {
	private static char[] arr = {'a', 'b', 'c'};
	private static int n = arr.length;
	private static boolean[] include = new boolean[n];
	
	public static void main(String[] args) {
		PowerSet(0);
	}
	
	public static void PowerSet(int k) {
		if(k==n) {
			for(int i=0;i<n;i++) {
				if(include[i]) {
					System.out.print(arr[i]+ " ");
				}
			}
			System.out.println();
			return;
		}
		
		include[k] = false;
		PowerSet(k+1);
		include[k] = true;
		PowerSet(k+1);
		
	}
}
