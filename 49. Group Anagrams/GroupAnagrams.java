import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class GroupAnagrams {

	public static void main(String[] args) {
	
		String [] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
		GroupAnagrams hp = new GroupAnagrams();
		System.out.println(hp.groupAnagrams(s));
	}
	
	 public List<List<String>> groupAnagrams(String[] strs) {
	        
		 HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		 ArrayList<String> key =  new ArrayList<String>();
		 for(String s: strs){
			 char[] c = s.toCharArray();
			 Arrays.sort(c);
			 String temp = String.valueOf(c);
			 //System.out.println(s +"------" + temp);
			 if(!map.containsKey(temp)){
				 key.add(temp);
				 List<String> h = new ArrayList<String>();
				 h.add(s);
				 map.put(temp, h);
			 }
			 else{
				 map.get(temp).add(s);
				 }
		 }
		 //System.out.println(map);
		 
		 List<List<String>> result = new ArrayList<List<String>>();
		 for(String s: key){
			 result.add(map.get(s));
			 //System.out.println(s);
		 }
		 
		 /*for(Entry<String, List<String>> entry: map.entrySet()){
		        Collections.sort(entry.getValue());
		    }
		 
		    result.addAll(map.values());*/
		 
		 return result;		 
	    }
	 
	 

}
