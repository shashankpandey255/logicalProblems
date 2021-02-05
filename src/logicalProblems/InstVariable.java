package logicalProblems;

public class InstVariable {
	int x=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstVariable obj=new InstVariable();
		System.out.println(obj.x);
		System.out.println(obj.print());
	}
	public int print() {
		int y=20;
		return y;
	}
	
	

}
