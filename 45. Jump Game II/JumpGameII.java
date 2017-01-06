public class JumpGameII {

	public static void main(String[] args) {
		
		int[] nums = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
		//int[] nums ={1,2};
		JumpGameII hp = new JumpGameII();
		System.out.println(hp.canJump(nums));
	}
	
	 public int canJump(int[] nums) {
		 
		 	int lastReach = 0;
			int reach = 0;
			int step = 0;
		 
			for (int i = 0; i <= reach && i < nums.length; i++) {
				//when last jump can not read current i, increase the step by 1
				if (i > lastReach) {
					step++;
					lastReach = reach;
				}
				//update the maximal jump 
				reach = Math.max(reach, nums[i] + i);
			}
		 
			if (reach < nums.length - 1)
				return 0;
		 
			return step;
	    }

}
