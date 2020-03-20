package solution;
import java.io.*; 
import java.util.HashMap;

public class Mapping {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Only two arguments allowed");
			return ;
		}
		boolean result = checkMapping(args[0], args[1]);
		System.out.println(result);
	}
	public static boolean checkMapping(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		HashMap<Character, Character> map1 = new HashMap<Character, Character>();
		HashMap<Character, Character> map2 = new HashMap<Character, Character>();
		
		for(int i = 0 ; i < s1.length() ; i++) {
			char x = s1.charAt(i);
			char y = s2.charAt(i);
			
			if(map1.containsKey(x) && y != map1.get(x) ) {
					return false;	
			}else {
				if(map2.containsKey(y)) {
					return false;
				}
				map1.put(x, y);
				map2.put(y, x);
			}
		}		
		return true;
	}
}
