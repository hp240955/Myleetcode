
public class HouseRobber {

	public static void main(String[] args) {
		int[] money = {4, 5, 7, 2, 3, 9, 1};
		HouseRobber hp = new HouseRobber();
		System.out.println(hp.rob(money));
	}
	
	public int rob(int[] nums) {
        
		if(nums.length ==1){
			return nums[0];
		}
		
		int a = nums[0];
		int b = Math.max(nums[0], nums[1]);
		
		for(int i = 2; i< nums.length; i++){
			int temp = b; 
			b = Math.max(a+nums[i], b);
			a = temp;	
		}
		
		return b;
		
		
    }

}
