import java.util.HashMap;


public class searchInsertPosition {

	public static void main(String[] args) {
		int[] array = {1,3,5,6};
		searchInsertPosition hp = new searchInsertPosition();
		
		System.out.println(hp.searchInsert2(array, 0));

	}
	
	
	public int searchInsert(int[] nums, int target) {
		int index = 0;
        
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i< nums.length; i++){
			map.put(nums[i], i);
		}
		
		if(map.containsKey(target)){
			index = map.get(target);
			return index;
		}
		return index;
		
    }
	
	public int searchInsert2(int[] nums, int target) {
		int index = 0;
		if(nums == null && nums.length == 0){
			return 0;
		}
		if(nums.length==1){
			if(nums[0] < target){
				index = 1;
			}
			else if(nums[0] == target){
				index = 0;
			}
			else{
				index = 0;
			}
		}
		
		if(nums[0] > target){
			index = 0;
			return index;
		}
		
		if(nums[nums.length-1] < target){
			index = nums.length;
			return index;
		}
		
		
		
		for(int i = 0; i<nums.length; i++){
			if(nums[i] == target){
				index = i;
				break;
			}
			
			if(i != nums.length -1){
				if(nums[i]<target && nums[i+1]>target){
					index = i + 1;
					break;
				}
			}
		}
		
		return index;
	}
	

}
