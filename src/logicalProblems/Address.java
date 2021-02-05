package logicalProblems;

public class Address {
	public boolean checkValidAddress(String Add){
		String[] ar= Add.split(".");
		if(ar.length==4) {
		for(String Tokens:ar){
			
			int temp=Integer.parseInt(Tokens);
			if(temp<0&&temp>255){
				return false;
			}
		}
		}
		else {
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		Address obj=new Address();
		boolean b=obj.checkValidAddress("30.230.20.255");
		System.out.println(b);
	}

}
