import java.util.HashMap;
import java.util.Map;


public class isomorphicStrings {

	public static void main(String[] args) {
		
		isomorphicStrings hp = new isomorphicStrings();
		
		System.out.println(hp.isIsomorphic("foo", "bar"));

	}
	
	public boolean isIsomorphic(String s, String t) {
		
		if(s == null || t == null)
			return false;
		if(s.length() != t.length())
			return false;
		if(s.length() == 0 && t.length() == 0)
			return true;
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		
		for(int i = 0; i< s.length(); i++){
			
			if(map.containsKey(s.charAt(i))){
				if(t.charAt(i) != map.get(s.charAt(i)))
					return false;
			}
			else{
				if(map.containsValue(t.charAt(i))){
					return false;
				}
				
				map.put(s.charAt(i), t.charAt(i));
			}
			map.put(s.charAt(i), t.charAt(i));
		}
		
		return true;
    }

}
