import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		
		String s = "abcabcabcabc";
		//String s="ab";
		RepeatedSubstringPattern hp = new RepeatedSubstringPattern();
		System.out.println(hp.repeatedSubstringPattern2(s));
		
	}
	 
	public boolean repeatedSubstringPattern(String str) {
		if(str.length()<2) return false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i< str.length(); i++){
			char key = str.charAt(i);
			if(map.containsKey(key)){
				map.put(key, map.get(key)+1);
			}
			else
				map.put(key, 1);
		}
		//map.toString();
		//System.out.println(map.toString());
			int temp = map.get(str.charAt(0)); 
			if(temp == 1) return false;
			for(Entry<Character, Integer> entry: map.entrySet()){
				if(temp != entry.getValue())
					return false;
			}
			
			return true;

		
	    }
	
	public boolean repeatedSubstringPattern2(String str) {
		int n = str.length();
        for(int i=n/2;i>=1;i--) {
            if(n%i==0) {
                int m = n/i;
                String substring = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(substring);
                }
                if(sb.toString().equals(str)) return true;
            }
        }
        return false;
	}

}
