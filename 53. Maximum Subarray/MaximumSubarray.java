
public class MaximumSubarray {

	public static void main(String[] args) {
	
		int[] array = {-2,1,-3,-5,3,-6,1,-5,2};
		
		MaximumSubarray hp = new MaximumSubarray();
		System.out.println(hp.maxSubArray(array));
	}
	
	public int maxSubArray(int[] nums) {
        
		int max = Integer.MIN_VALUE;
		int sum = 0; 
		
		for(int i = 0; i<nums.length; i++){
			sum =  Math.max(sum+nums[i], nums[i]);
			max = Math.max(max, sum);
		}
		
		return max;
		
		/*
		 if (nums == null || nums.length == 0) return 0;
    int globalMax = Integer.MIN_VALUE, localMax = 0;
    for (int i = 0; i < nums.length; i++) {
      localMax += nums[i];
      globalMax = Math.max(globalMax, localMax);
      if (localMax < 0) localMax = 0;
    }
    return globalMax;
		 */
    }

}
