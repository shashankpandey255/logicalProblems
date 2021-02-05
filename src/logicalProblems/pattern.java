package logicalProblems;

public class pattern {
	public static void main(String[] atgs) {
		for(int i=0;i<=2;i++) {
			
			for(int j=0;j<=2;j++) {	
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			
		}

		/*String str="Shashank";
		int l=str.length()-1;
		for (int i=0;i<=l;i++) {
			System.out.println(str.charAt(i));
		}*/
		
		
	}

}
