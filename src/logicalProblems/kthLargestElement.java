package logicalProblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestElement {
	public int kthElement(int ar[], int k) {
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int elements : ar) {
			maxheap.add(elements);
		}
		for (int i = 1; i < k; i++) {
			maxheap.remove();
		}
		return maxheap.peek();
	}

}
