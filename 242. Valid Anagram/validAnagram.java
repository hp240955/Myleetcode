import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class validAnagram {

	public static void main(String[] args) {
		
		validAnagram hp = new validAnagram();
		
		//System.out.println(hp.isAnagram("anagram", "nagaram"));
		System.out.println(hp.isAnagram("aacc", "ccac"));

	}
	
	public boolean isAnagram(String s, String t) {
		
		if(s == null || t == null)
			return false;
		if(s.length() != t.length())
			return false;
		if(s.length() == 0 && t.length() == 0)
			return true;
        
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		
		Arrays.sort(sChar);
		Arrays.sort(tChar);
		
		List<Character> sSet = new ArrayList<Character>();
		List<Character> tSet = new ArrayList<Character>();
		
		for(int i = 0; i<s.length(); i++){
			sSet.add(sChar[i]);
			tSet.add(tChar[i]);
		}
		
		Iterator<Character> sIter = sSet.iterator();
		Iterator<Character> tIter = tSet.iterator();
		
		while(sIter.hasNext() && tIter.hasNext()){
			if(sIter.next().equals(tIter.next()) == false){
				return false;
			}
		}
		
		return true;	
    }

}
