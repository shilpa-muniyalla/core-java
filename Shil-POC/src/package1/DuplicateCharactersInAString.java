package package1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInAString {
	
	public static void findDuplicateCharactersInAString(String s) {
		char[] word=s.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(char c:word) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
				
				
			else {
				map.put(c,1);
			}
		}
			Set<Character> set=map.keySet();
			for(Character ch:set) {
				if(map.get(ch)>1) {
					System.out.println(ch+ " "+map.get(ch));
				}
			}
		}
	

	public static void main(String[] args) {
		findDuplicateCharactersInAString("BITTER BUTTER");
		
		

	}

}
