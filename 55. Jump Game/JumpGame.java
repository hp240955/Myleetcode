
public class JumpGame {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1,1,4};
		JumpGame hp = new JumpGame();
		System.out.println(hp.canJump(nums));
	}
	
	 public boolean canJump(int[] nums) {
		 int reach = nums[0];
	        for(int i = 1; i < nums.length && reach >= i; i++)
	            if(i + nums[i] > reach) reach = i + nums[i]; 
	        return reach >= (nums.length-1) ? true : false;
	    }

}
