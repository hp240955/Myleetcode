import java.util.ArrayList;
import java.util.HashMap;


public class WordDistance {

	private HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
	 public WordDistance(String[] words) {
	        for(int i = 0; i < words.length; i++){
	        	if(map.containsKey(words[i])){
	        		map.get(words[i]).add(i);
	        	}
	        	else{
	        		ArrayList<Integer> temp = new ArrayList<Integer>();
	        		temp.add(i);
	        		map.put(words[i], temp);
	        	}
	        }
	    }

	    public int shortest(String word1, String word2) {
	    
	    	ArrayList<Integer> oneList = map.get(word1);
	    	ArrayList<Integer> twoList = map.get(word2);
	    	
	    	int distance  = Integer.MAX_VALUE; int i = 0, j = 0; 
	    	
	    	while(i<oneList.size()&&j<twoList.size()){
	    		int one = oneList.get(i); int two = twoList.get(j);
	    		
	    		if(one<two){
	    			distance = Math.min(distance, two -one);
	    			i++;
	    		}
	    		else{
	    			distance = Math.min(distance, one -two);
	    			j++;
	    		}
	    	}
	    	
	    	return distance;
	    }
}
