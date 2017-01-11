import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class MaximumSizeSubarraySum {

	public static void main(String[] args) {
		//int[] array = {1, -1, 5, -2, 3};
		int[] array = {1, -1, 5, -1, 3};
		int k = 3; 
		
		MaximumSizeSubarraySum hp = new MaximumSizeSubarraySum();
		System.out.println(hp.maxSubArrayLen(array, k));

	}
	
	public int maxSubArrayLen(int[] nums, int k) {
        
		 if (nums==null || nums.length==0) return 0;
		       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		          map.put(0, -1);
		          int sum = 0;
		          int maxLen = Integer.MIN_VALUE;
		          for (int i=0; i<nums.length; i++) {
		              sum += nums[i];
		             if (!map.containsKey(sum)) {
		                 map.put(sum, i);
		             }
		             if (map.containsKey(sum-k)) {
		                 int index = map.get(sum-k);
		                 maxLen = Math.max(maxLen, i-index);
	             }
	         }
		         return maxLen==Integer.MIN_VALUE? 0 : maxLen;
		
    }

}
