import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class TopKFrequentElements {

	public static void main(String[] args) {
		int [] nums = {1,1,1,2,2,3,3,4};
		int k = 3;
		
		
		TopKFrequentElements hp = new TopKFrequentElements();
		System.out.println(hp.topKFrequent(nums, k));

	}
	
	 public List<Integer> topKFrequent(int[] nums, int k) {
	        int pre = 0; 
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        HashMap<Integer, ArrayList<Integer>> map1 = new HashMap<Integer, ArrayList<Integer>>();
	        for(int i = 0; i<nums.length; i++){
	        	if(map.containsKey(nums[i])){
	        		pre = map.get(nums[i]) + 1;
	        		map.put(nums[i], pre);
	        	}
	        	else{map.put(nums[i], 1);}
	        } 
	        
	        for(int i = 0; i< map.keySet().toArray().length; i++){
	        	
	        	int key = (int) map.keySet().toArray()[i];
	        	
	        	if(map1.containsKey(map.get(key))){
	        		map1.get(map.get(key)).add(key);
	        	}
	        	else{
	        		ArrayList<Integer> list = new ArrayList<Integer>();
	        		list.add(key);
	        		map1.put(map.get(key), list);
	        	}
	        }
	        
	        Object[] map1Key = map1.keySet().toArray();
	        Arrays.sort(map1Key);
	        List<Integer> values = new ArrayList<Integer>();
	        for(int i = map1Key.length-1; i>=0; i--){
	        	values.addAll(map1.get(map1Key[i]));
	        }
	        
	        List<Integer> result =  new ArrayList<Integer>();
	        for(int i = 0; i< k; i++){
	        	result.add(values.get(i));
	        }
	        
	        return result;  
	    }

}
