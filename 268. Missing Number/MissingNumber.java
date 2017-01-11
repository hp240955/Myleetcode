import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {0, 2, 3};
		MissingNumber hp = new MissingNumber();
		System.out.println(hp.missingNumber(nums));
	}
	
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] != i){
        		
        		if( i+1 != nums.length && nums[i+1] != i+1)
        			return nums[i]-1;
        	return i;
        	}
        }
        
        return nums.length;
    }

}
