public class Solution {
	public int median(int[] A) {
		
		int less = 0;
		int[] B = new int[A.length];
		for(int i = 0; i < B.length; i++) {
			B[i] = -1;
		}
		
		if (A.length == 0)
			return 0;

		if (A.length == 1)
			return A[0];

		for (int i = 0; i < A.length / 2; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					less++;
				}

			}
			
			while(less<B.length && B[less] != -1) {
				less++;					
			}
			B[less] = A[i];

			less = 0;
		}
		return B[B.length / 2];
	
	}
}
