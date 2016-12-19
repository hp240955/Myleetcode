import java.util.HashMap;


public class twoSum {
//
	public static void main(String[] args) {
		int[] array = {2, 2, 7, 11, 15};
		twoSum hp = new twoSum();
		for(int i: hp.twoSum(array, 9)){
			System.out.println(i);
		}
		

	}
	
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map =  new HashMap<Integer, Integer>();
        int[] index = new int[2];
        
        for(int i=0; i<nums.length; i++){
        	
        	if(map.containsKey(target - nums[i])){
        		index[1] = i + 1;
        		index[0] = map.get(target - nums[i]) + 1;
        	}
        	
        	map.put(nums[i], i);
        }
        
        return index;
    }

}
