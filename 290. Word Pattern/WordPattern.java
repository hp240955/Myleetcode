import java.util.HashMap;


public class WordPattern {

	public static void main(String[] args) {
		
		String pattern = "abba";
		String str = "cat dog dog cat";
		
		WordPattern hp = new WordPattern();
		
		System.out.println(hp.wordPattern(pattern, str));
		

	}
	
	public boolean wordPattern(String pattern, String str) {
		
		String[] s = str.split(" ");

		if(pattern == null || str == null)
			return false;
		if(pattern.length() != s.length)
			return false;
		if(pattern.length() == 0 && str.length() == 0)
			return true;
		
		HashMap<Character, String> map = new HashMap<Character, String>();
		
		
		//System.out.println(s.length);
		for(int i = 0; i < s.length; i++){
			if(map.containsKey(pattern.charAt(i))){
				if(!map.get(pattern.charAt(i)).equals(s[i]))
					return false;
			}

			else{
				if(map.containsValue(s[i])){
					return false;
				}
				map.put(pattern.charAt(i), s[i]);
				}
		}
		return true;
    }

}
