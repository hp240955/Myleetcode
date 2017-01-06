import java.util.Arrays;

public class SumClosest {

	public static void main(String[] args) {
		int nums[] = {-1, 2, 1, -4};
		SumClosest hp  = new SumClosest();
		System.out.println(hp.threeSumClosest(nums, 1));
		
	}
	
	 public int threeSumClosest(int[] nums, int target) {
	        
		 Arrays.sort(nums);
		 int min = Integer.MAX_VALUE;
		 int result = 0;
		 for(int i =0; i< nums.length-2; i++){
			 int left = i +1; 
			 int right = nums.length-1;
			 while(left<right){
				 int sum = nums[left] + nums[right] + nums[i];
				 int diff = Math.abs((sum-target));
				 if(diff == 0) return sum;
				 
				 if(diff<min){
					 min = diff;
					 result = sum;
				 }
				
				 if(sum<=target){
					 left++;
				 }
				 else{
					 right--;
				 }
			 }
		 }
		 return result;
	    }

}
