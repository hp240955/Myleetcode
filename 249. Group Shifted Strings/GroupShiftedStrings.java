
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class GroupShiftedStrings {

	public static void main(String[] args) {
		String[] groups = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};

		GroupShiftedStrings hp  = new GroupShiftedStrings();
		System.out.println(hp.groupStrings(groups));
		
	}
	
	 public List<List<String>> groupStrings(String[] strings) {
	        
		 HashMap<Integer, List<String>> map =  new HashMap<Integer, List<String>>(); 
		 List<String> box;
		 for(int i = 0; i<strings.length; i++){
			 
			if(map.containsKey(strings[i].length())){
				
				map.get(strings[i].length()).add(strings[i]);
			}
			else{
				box = new ArrayList<String>();
				box.add(strings[i]);
				map.put(strings[i].length(), box);
				}
		 }
		 
		 Object[] key = map.keySet().toArray();
		 
		 List<List<String>> result = new ArrayList<List<String>>();
		 
		 int temp = 0;
		 for(int i = 0; i < key.length; i++){
			 temp = (Integer)key[i];
			 result.add(map.get(temp));
		 }
		 
		 return result;
	    }

}
