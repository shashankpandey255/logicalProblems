package logicalProblems;

public class Fibonacci {
	public void PrintFibonacci(int l){
		int[] ar=new int[l];
		ar[0]=1;
		ar[1]=2;
		for(int i=2;i<l;i++){
			ar[i]=ar[i-1]+ar[i-2];
			}
			for(int elements:ar)
				System.out.println(elements);
			}
		public static void main(String[] args){
			Fibonacci obj=new Fibonacci();
			obj.PrintFibonacci(10);
		}
	

}
