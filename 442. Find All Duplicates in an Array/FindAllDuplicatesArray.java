import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesArray {

	public static void main(String[] args) {

		int[] nums = {4,3,2,7,8,2,3,1};
		
		FindAllDuplicatesArray hp = new FindAllDuplicatesArray();
		for(int i : hp.findDuplicates(nums)){
			System.out.println(i);
		}
	}
	
	public List<Integer> findDuplicates(int[] nums) {
		Arrays.sort(nums);
		List<Integer> result = new ArrayList<Integer>();
        for(int i = 1; i<nums.length; i++){
        	if(nums[i] == nums[i-1]){
        		result.add(nums[i]);
        	}
        }
        
        return result;
    }

}
