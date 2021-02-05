package logicalProblems;

public class sortA {
	int i, j, minIdx, temp;

	public void sortA(int[] ar) {
		int n = ar.length;
		for (i = 0; i <= n - 2; i++) {
			minIdx = i;
			for (j = i + 1; j <= n - 1; j++) {
				if (ar[j] < ar[minIdx]) {
					minIdx = j;
				}
			}
			temp = ar[i];
			ar[i] = ar[minIdx];
			ar[minIdx] = temp;
		}
		for (int elements : ar) {
			System.out.print(elements + " ");
		}
	}

}
