package logicalProblems;
//int ar[]={1,200,8,100,12};
public class findElement {
	
	public void findBiggestElement(int arr[]) {
		int n = arr.length;
		for (int i = 0; i <1; i++) {
			int mIdx = i;
			for (int j = i +1; j < n; j++) {
				if (arr[j] > arr[mIdx]) 
					mIdx = j;			
				
			}
			System.out.println(arr[mIdx]);
		}
		
	}

}
