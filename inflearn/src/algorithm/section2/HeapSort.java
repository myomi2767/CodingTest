package algorithm.section2;

public class HeapSort {
	private static int heapSize;
	
	public static void main(String[] args) {
		int[] data = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		heapSort(data);
		for (int i : data) {
			System.out.print(i + " ");
		}
	}
	
	private static void heapSort(int[] data) {
		buildMaxHeap(data);
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = heapSize ; i >= 2 ; i--) {
			int tmp = data[i-1];
			data[i-1] = data[0];
			data[0] = tmp;
			
			heapSize -= 1;
//			MaxHeapifyRecursive(data, 1);
			MaxHeapifyIterate(data, 1);
		}
	}
	
	private static void buildMaxHeap(int[] data) {
		heapSize = data.length;
		for(int i = data.length/2 ; i >= 1 ; i--) {
//			MaxHeapifyRecursive(data, i);
			MaxHeapifyIterate(data, i);
		}
	}
	
	// 반복문을 사용한 Heapify 메소드 >> Heap을 만드는 과정
	private static void MaxHeapifyIterate(int[] data, int idx) {
		int left, right, k;
		
		while(heapSize/2 >= idx) {
			left = idx * 2;
			right = idx * 2 + 1;
			k = idx;
			
			if(left <= heapSize && data[left-1] > data[k-1]) {
				k = left;
			}
			
			if(right <= heapSize && data[right-1] > data[k-1]) {
				k = right;
			}
			
			if(data[k-1] <= data[idx-1]) {
				return;
			}
			// exchange A[idx] and A[k]
			int temp = data[k-1];
			data[k-1] = data[idx-1];
			data[idx-1] = temp;
			
			idx = k;
		}
	}
	
	// 재귀를 사용한 Heapify 메소드 >> Heap을 만드는 과정
	private static void MaxHeapifyRecursive(int[] data, int idx) {
		int left, right, k;
		
		left = idx * 2;
		right = idx * 2 + 1;
		k = idx;
		
		if(heapSize/2 < idx) {
			return;
		}
		
		if(left <= heapSize && data[left-1] > data[k-1]) {
			k = left;
		}
		
		if(right <= heapSize && data[right-1] > data[k-1]) {
			k = right;
		}
		// data[idx]값이 더 큰 경우 recusive 종료
		if(data[k-1] <= data[idx-1]) {
			return;
		}
		// exchange A[idx] and A[k]
		int temp = data[k-1];
		data[k-1] = data[idx-1];
		data[idx-1] = temp;
		
		MaxHeapifyRecursive(data, k);
	}
}
