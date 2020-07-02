package interviewQuestion11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Substring {
	public static void main(String[] args) {
		// the longest substring without duplicate chars
		String str = "ABDEFGABEF";
		char[] chars = str.toCharArray();
		ArrayList<String> allSubs = new ArrayList<String>();
		while (chars.length > 0) {
			Set<Character> tempSet = new HashSet<Character>();
			String subNoDup = "";
			for (int i = 0; i < chars.length; i++) {
				if (tempSet.add(chars[i])) {
					subNoDup += chars[i];
				} else {
					break;
				}
			}
			str = str.replaceAll(subNoDup, "");
			allSubs.add(subNoDup);
			subNoDup = "";
			tempSet.clear();
			chars = str.toCharArray();
			
		}
		
		System.out.println(allSubs);
		int max = allSubs.get(0).length();
		for (String string : allSubs) {
			if(string.length() > max) {
				max = string.length();
				System.out.println(string + " is the longest substring without any duplicate value  with the length of " + max);
			}
			
		}
		// how to get a sub-string
	}
}