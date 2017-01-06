


public class Solution2 {

	public static void main(String[] args) {
		int[] array = {1,1,2,2,2,2,2,2,3,4,4,4,4,5,5,5,5,5,5,5};
		//int[]array = {};
		Solution2 hp = new Solution2();
		System.out.println(hp.removeDuplicates(array));
		//hp.removeDuplicates(array)
	}
	
	public int removeDuplicates(int[] nums) {
		int count;
		if(nums == null || nums.length == 0){
			count = 0;
		}
		else{
			int flag = nums[0];
	        count = 1;
	        for(int i =1; i<nums.length; i++){
	        	if(nums[i] == flag){
	        		continue;
	        	}
	        	else{
	        		flag = nums[i];
	        		count++;
	        		nums[count -1] = flag;
	        	}
	        }
		}	        
	        return count;
    }

}
