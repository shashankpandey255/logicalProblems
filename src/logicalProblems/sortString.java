package logicalProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortString {
	
	List<Integer> Plist=new ArrayList();
	List<Integer> Clist=new ArrayList();
	int asciiD;
	public void printAscci() {
		int ascii=97;
		System.out.println((char)ascii);
	}
	public void printChar() {
		int ascii='a';
		System.out.println(ascii);
	}
	public void rearrange(String S) {
		int len=S.length()-1;
		char ch;
		while(len>=0) {
			asciiD=S.charAt(len);
			System.out.println(asciiD);
			if(checkPrime(asciiD)==0) 
				Plist.add(asciiD);
			else 
				Clist.add(asciiD);
			len--;
		}
		Collections.sort(Plist);
		Collections.sort(Clist,Collections.reverseOrder());
		Plist.addAll(Clist);
		System.out.println(Plist);
		String Str="";
		int l1=Plist.size();
		int cd;
		for(int i=0;i<l1;i++) {
			cd=Plist.get(i);
			ch=(char)cd;
			Str=Str+ch;
		}
		System.out.println(Str);
		
	}
	public static int checkPrime(int num) {
		for(int d=2;d<num;d++) {
			if(num%d==0)
				return 1;
		}
		return 0;
	}


}
