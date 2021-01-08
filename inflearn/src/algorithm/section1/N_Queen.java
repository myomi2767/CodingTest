package algorithm.section1;

public class N_Queen {
	private static int N = 8;
	private static int[] cols = new int[N+1];
	private static int count = 0;
	public boolean queens(int level) {
		if(!promising(level)) {
			return false;
		}else if(level==N) {
			for(int i=1; i <= N; i++) {
				System.out.println("(" + i + ", " + cols[i] + ")");
			}
			return true;
		}else {
			for(int i = 1; i <= N; i++) {
				cols[level+1] = i;
				if(queens(level + 1)) {
					return true;
				}
			}
			return false;
		}
	}
	
	public void queens_count(int level) {
		if(level==N) {
			count++;
			return;
		}else {
			for(int i = 1; i <= N; i++) {
				cols[level+1] = i;
				if(promising(level+1)) {
					queens_count(level+1);
				}
			}
		}
	}
	
	private boolean promising(int level) {
		for(int i=1; i<level; i++) {
			if(cols[i]==cols[level]) {
				return false;
			}else if((level-i)==Math.abs(cols[level]-cols[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		N_Queen q = new N_Queen();
		q.queens_count(0);
		System.out.println(count);
	}
}
