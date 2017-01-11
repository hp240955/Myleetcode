import java.util.HashMap;
import java.util.Set;


public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {-1,-1,-2};
		
		SingleNumber hp = new SingleNumber();
		System.out.println(hp.singleNumber(nums));
		

	}
	
	public int singleNumber(int[] nums) {
        
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<nums.length; i++){
			if(map.containsKey(nums[i])){
				map.remove(nums[i]);
			}
			else{
				map.put(nums[i], 1);
			}
		}
		
		//System.out.println(map);
		
		
		return (int) map.keySet().toArray()[0];
    }

}
