import java.util.ArrayList;
import java.util.HashMap;


public class MinimumWindowSubstring {

	public static void main(String[] args) {
	
		String s = "ADOBECODEBANCDABC";
		String t = "ABC";
		
		MinimumWindowSubstring hp = new MinimumWindowSubstring();
		
		System.out.println(hp.solution(s, t));

	}
	

	public String minWindow(String s, String t) {
		
		 if(s==null||s.length()==0||t==null||t.length()==0){
		        return "";
		    }
		 
		 HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
		 
		 for(int i = 0; i<t.length(); i++){
			 char temp = t.charAt(i);
			 if(!s.contains(temp+"")){
				 return "";
			 }
			 if(map.containsKey(temp)){
				 map.put(temp, map.get(temp)+1);
			 }
			 else{
				 map.put(temp, 1);
			 }
		 }
		 
		 
		 HashMap<Character, Integer> currentMap =  new HashMap<Character, Integer>();

		 int start = 0;
		 int end = 0;
		 
		 int count = 0;
		 for(int j = 0; j< s.length(); j++){
			 
		 }
		 
		 
    }
	
	public String solution(String S, String T){
		 HashMap<Character, Integer> dict = new HashMap<>();
	        for (int i = 0; i < T.length(); i++) {
	            char c = T.charAt(i);
	            if (!dict.containsKey(c))
	                dict.put(c, 1);
	            else
	                dict.put(c, dict.get(c) + 1);
	        }
	        HashMap<Character, Integer> found = new HashMap<>();
	        int foundCounter = 0;
	        int start = 0;
	        int end = 0;
	        int min = Integer.MAX_VALUE;
	        String minWindow = "";
	        
	        //ADOBECODEBANCDABC
	        while (end < S.length()) {
	            char c = S.charAt(end);
	            if (dict.containsKey(c)) {
	                if (found.containsKey(c)) {
	                    if (found.get(c) < dict.get(c)){
	                    	 foundCounter++;
	                    }
	                       
	                    found.put(c, found.get(c) + 1);
	                } else {
	                    found.put(c, 1);
	                    foundCounter++;
	                }
	            }
	            if (foundCounter == T.length()) {
	                //When foundCounter equals to T.length(), in other words, found all characters.
	                char sc = S.charAt(start);
	                while (found.containsKey(sc) == false || found.get(sc) > dict.get(sc)) {
	                    if (found.containsKey(sc) && found.get(sc) > dict.get(sc))
	                        found.put(sc, found.get(sc) - 1);
	                    start++;
	                    sc = S.charAt(start);
	                }
	                if (end - start + 1 < min) {
	                    minWindow = S.substring(start, end + 1);
	                    min = end - start + 1;
	                }
	            }
	            end++;
	        }
	        
	        System.out.println(found);
	        return minWindow;
	}
}
