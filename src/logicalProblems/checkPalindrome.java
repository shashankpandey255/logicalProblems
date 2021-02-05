package logicalProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class checkPalindrome {
	public boolean StringPal(String str) {
		Set<String> seen=new HashSet<String>();
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
