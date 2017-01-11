import java.util.HashMap;
import java.util.Map;


public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";
		LongestSubstringWithoutRepeatingCharacters hp = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(hp.lengthOfLongestSubstring(s));
		

	}

	 public int lengthOfLongestSubstring(String s) {
	        
		 char[] h = s.toCharArray();
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		 int temp = 0;
		 
		 for(int i = 0; i<h.length; i++){
			 if(!map.containsKey(h[i])){
				 map.put(h[i], i);
			 }
			 else{
				 temp = Math.max(temp, map.size());
				 i = map.get(h[i]);
				 map.clear();
			 }
		 }
		 
		 return Math.max(temp, map.size());
	    }
}
