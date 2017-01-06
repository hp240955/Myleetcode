import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class searchForRange {

	public static void main(String[] args) {
		//int[] array = {5, 7, 7, 8, 8, 10};
		//int[] array = {8,8,8,8};
		int[] array = {1};
		searchForRange hp = new searchForRange();
		for(int i: hp.searchRange(array, 1)){
			System.out.print(i + " ");
		}

	}
	
public int[] searchRange(int[] nums, int target) {
        
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	//Set<Integer> array = new HashSet<Integer>(); 
	ArrayList<Integer> array = new ArrayList<Integer>(); 
	int[] result;
	
	for(int i = 0; i < nums.length; i++){
		map.put(nums[i], i);
		
		if(map.containsKey(target)){
			
				array.add(map.get(target));
			
		}
	}
	
	if(array.size() == 0){
		result = new int[2];
		result[0] = -1;
		result[1] = -1;
	}
	
	
	else{
		int end = array.size() -1;
		//array.remove(end);
		result = new int[2];
		result[0] = array.get(0);
		result[1] = array.get(end);
	}
	
	return result;
    }

}
