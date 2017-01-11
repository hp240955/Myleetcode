
public class MaximumProductSubarray {

	public static void main(String[] args) {
	
		int[] array = {2, 3, -2, 4};
		

		MaximumProductSubarray hp = new MaximumProductSubarray();
		System.out.println(hp.maxProduct(array));

	}
	
	public int maxProduct(int[] nums) {
		
	int max[] =  new int[nums.length];
	int min[] = new int[nums.length];
	
	int result = Integer.MIN_VALUE;
	max[0] = nums[0];
	min[0] = nums[0];
	
	for(int i = 1; i< nums.length; i++){
		if(nums[i]>0){
			max[i] = Math.max(max[i-1] * nums[i], nums[i]);
			min[i] = Math.min(min[i-1] * nums[i], nums[i]);
		}
		else{
			max[i] = Math.max(min[i-1] * nums[i], nums[i]);
			min[i] = Math.min(max[i-1] * nums[i], nums[i]);
		}
		
		result = Math.max(result, max[i]);
	}
	
	return result;
	
    }

}
