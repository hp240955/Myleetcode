import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedArray {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		FindAllNumbersDisappearedArray hp = new FindAllNumbersDisappearedArray();
		for(int i: hp.findDisappearedNumbers(nums)){
			System.out.println(i);
		}
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        
		Arrays.sort(nums);
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != i+1){
				if(result.contains(nums[i]))
					result.remove(result.indexOf(nums[i]));
				result.add(i+1);
			}
		}
		
		return result;
    }

}
