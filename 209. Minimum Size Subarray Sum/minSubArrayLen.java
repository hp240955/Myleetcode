import java.util.ArrayList;
import java.util.Arrays;


public class minSubArrayLen {

	public static void main(String[] args) {
		int[] array = {2,3,1,2,4,3};
		
		minSubArrayLen hp = new minSubArrayLen();
		System.out.println(hp.minSubArrayLen2(7, array));

	}
	
	public int minSubArrayLen2(int s, int[] nums) {
		
		if(nums==null || nums.length == 0){
			return 0;
		}
		int lPointer = 0;
		int rPointer = 0;
		int sum = nums[0];
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(rPointer <nums.length){
			if(sum<s){
				rPointer++;
				if(rPointer == nums.length){
					break;
				}
				sum = sum + nums[rPointer];
			}
			else{
				result.add(rPointer - lPointer +1);
				sum = sum - nums[lPointer];
				lPointer++;
			}
		}
		
		if(result == null || result.size() == 0){
			return 0;
		}
	
		int[] array = new int[result.size()];
		for(int i = 0; i<result.size(); i++){
			array[i] = result.get(i);
		}
		result.toArray();
		Arrays.sort(array);
		return array[0];
	}
	
	public int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
		//int min = -1;
        int count = 0;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
        	count = 1;
        	sum = sum + nums[i];
        	for(int j = 1; j< nums.length; j++){
        		sum = sum + nums[j];
        		count++;
        		if(sum>=s && count <min){
        			min = count;
        			count = 0;
        			sum = 0;
        		}
        		
        	}
        }
        if(min == Integer.MAX_VALUE){
        	return 0;
        }
        return min;
    }

}
