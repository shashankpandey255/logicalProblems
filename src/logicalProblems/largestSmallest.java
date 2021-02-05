package logicalProblems;

import java.util.PriorityQueue;

public class largestSmallest {
	public int findlargestSmallest(int nums[]) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		for(int i:nums) 
			minHeap.add(i);
		return minHeap.remove();
		
	}

}
