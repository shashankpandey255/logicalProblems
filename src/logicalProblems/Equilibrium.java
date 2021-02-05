package logicalProblems;

public class Equilibrium {
	public int findIndex(int ar[]) {
		int i;
		int leftSum;
		int rightSum;
		int len = ar.length;
		int totalSum = ar[0];
		int[] arSum = new int[len];
		arSum[0] =ar[0];
		for (i = 1; i < len; i++) {
			arSum[i] = arSum[i - 1] + ar[i];
			totalSum = totalSum + ar[i];
		}
		System.out.println(totalSum);
		for (i = 1; i < len; i++) {
			leftSum = arSum[i] - ar[i];
			rightSum = totalSum - arSum[i];
			if (leftSum == rightSum)
				return i;
		}
		return -1;
	}
}
