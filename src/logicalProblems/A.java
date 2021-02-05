package logicalProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class A {
	public static void main(String args[])  {

		int ar[] = { 840, 2000, 800, 100, 12 };
		int arr[]= {1,2,6,4,0,-1};
		
		
		String s1 ="abc";
		String s2= new String("abc");
		String s3 = "abc";
		StringBuilder sb1= new StringBuilder("abc");

		/*
		 * findElement sa=new findElement(); sa.findBiggestElement(ar);
		 * 
		 * sortAsc as=new sortAsc(); as.sortAscArray(ar);
		 */

		/*
		 * largestSmallest obj= new largestSmallest();
		 * System.out.println(obj.findlargestSmallest(ar));
		 */
		exceptJandle obj=new exceptJandle();
		obj.go();
		
		//TestprivateConstructor t1=new TestprivateConstructor();
		
		
//		testInterf ta=new testInterf();
	//	ta.doStuff();
		
		missingrepeating t1=new missingrepeating();
		t1.logicalTwoProblem();
		 
		checkPalindrome obj1=new checkPalindrome();
		if(obj1.StringPal("aabaa"))
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
			
		System.out.println();obj1.StringPal("aabcaa");
		
		//----------------------------------------------------------------------
		Animal anim=new Dog();
		anim.eat();
		
		((Dog)anim).barking();
		
		//----------------------------------------------------------------------
		System.out.println("Sorted Array:");
		sortA abc=new sortA();
		abc.sortA(ar);
		
		
		System.out.println("-----------------------------------------");
		System.out.println(s1.equals(s3));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s3.equals(sb1));
		System.out.println();
		
		
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(null);
		
		Iterator<Integer> i1=set.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		
		
		/*try {
			FileReader file = new FileReader("C:\\test\\a.txt"); 
	        BufferedReader fileInput = new BufferedReader(file);
		}
		finally {
			System.out.println("Finally");
		}*/
		
		//------------------------------------------------------------------------------
		System.out.println("-----------------------------------------");
		Equilibrium eq=new Equilibrium() ;
			System.out.println(eq.findIndex(arr));
			
		
		System.out.println("-----------------------------------------");
		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(null);
		li.add(3);
		li.add(null);
		System.out.println(li);
		
		
		sortString sat=new sortString();
		//sat.printAscci();
		//sat.printChar();
		sat.rearrange("Khokharnikunj");
		
				
	}

}
