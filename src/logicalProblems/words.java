package logicalProblems;

public class words {
	public static void main(String [] args) {
		String str="Strong and effective communicator with strong coordination, strong learning and accustomed to work in a team environment with tight schedules and capable of working efficiently under pressure. Involved in preparation and conducting project based knowledge sharing program for the new team member(s) in the project";
		int index1=str.indexOf(".");
		int index2=str.indexOf("member");
		System.out.println(str.substring(index1, index2));
		
	}
	


}
