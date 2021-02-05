package logicalProblems;

public class exceptJandle {
	static int x = 10;

	public void go() {
		
		System.out.println(x);
	}

	static {
		System.out.println("abx");
		x++;
	}
}
