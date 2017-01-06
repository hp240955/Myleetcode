import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3};
		SubsetsII hp = new SubsetsII();
		System.out.println(hp.subsetsWithDup(nums));
		
	}
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		getSubsetsWithDup(result, new ArrayList<Integer>(), nums, 0);
		return result;
    }
	
	private void getSubsetsWithDup(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
		result.add(new ArrayList<Integer>(list));
		for (int i = start; i < nums.length; i++) {
			if (i > start && nums[i] == nums[i - 1]) continue;
			list.add(nums[i]);
			getSubsetsWithDup(result, list, nums, i + 1);
			list.remove(list.size() - 1);
		}
	}

}
