package logicalProblems;

public class sortZeroesOnesTwos {

	public void sortingColors(int arr[]) {
		int start=0;int temp=0;
		int mid=0;
		int end=arr.length-1;
		while(mid<=end) {
			if(arr[mid]==0) {
				temp=arr[start];
				arr[start]=arr[mid];
				arr[mid]=temp;
				mid++;
				start++;
			}
			else if(arr[mid]==2) {
				temp=arr[mid];
				arr[mid]=arr[end];
				arr[end]=temp;
				end--;
			}
			else {
				mid++;
			}
		}
		for(int elements:arr) {
			System.out.print(elements+" ");
		}

	}
}
