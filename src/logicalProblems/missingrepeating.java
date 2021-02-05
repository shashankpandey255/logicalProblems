package logicalProblems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class missingrepeating {
	int ar[]= {8,5,9,5,2,10,7,6,3,4};int sum=0;
	int i;int pos;int repeatedNumber;int repeadtedNumberIndex;int missingNumber;
	public void logicalOneProblem() {
		
		int countAr[]= {0,0,0,0,0,0,0,0,0,0,0};
		for(i=0;i<10;i++) {
			pos=ar[i];
			countAr[pos]=countAr[pos]+1;
			if(countAr[pos]>1) {
				repeatedNumber=pos;
			    repeadtedNumberIndex=i;
			}
		}
		for(i=1;i<=10;i++) {
			if(countAr[i]==0) {
				missingNumber=i;
				ar[repeadtedNumberIndex]=i;
			}
			
		}
		System.out.println("repeatedNumber="+repeatedNumber);
		System.out.println("missingNumber="+missingNumber);
		System.out.println("repeadtedNumberIndex="+repeadtedNumberIndex);
	}
	
	
/********************************************************************************/	
	
	public void logicalTwoProblem() {
		
		Set<Integer> S1=new HashSet<Integer>();
		for(i=0;i<=9;i++) {
			sum=sum+ar[i];
			if(S1.contains(ar[i])) {
				repeatedNumber=ar[i];
				repeadtedNumberIndex=i;
				
			}
			S1.add(ar[i]);
		}
		System.out.println(sum);
		missingNumber=55-(sum-repeatedNumber);
		System.out.println("repeatedNumber="+repeatedNumber);
		System.out.println("missingNumber="+missingNumber);
		System.out.println("repeadtedNumberIndex="+repeadtedNumberIndex);
		
		
		
		
		
		
		//---------------------------------------------------------------------------
		
	}
			
}
