import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		
		int[] nums = {2, 2, 3, 1};
		
		ThirdMaximumNumber hp = new ThirdMaximumNumber();
		System.out.println(hp.thirdMax(nums));
		

	}
	
	public int thirdMax(int[] nums) {
        
		if(nums == null){
			return 0;
		}
		if(nums.length == 0){
			return 0;
		}
		
		Arrays.sort(nums);
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i: nums){
			set.add(i);
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(set.size()<3){
			for(int i: set){
				result.add(i);
			}
			return result.get(result.size()-1);
		}
		else{
			for(int i: set){
				result.add(i);
			}
			return result.get(result.size()-3);
		}
    }

}
