import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class threeSum {

	public static void main(String[] args) {
		int[] array = {-1, 0, 1, 2, -1, -4};
		threeSum hp = new threeSum();
		
		for(List<Integer> i: hp.threeSum(array)){
			for(int j = 0; j<i.size(); j++){
				System.out.print(i.get(j) + " ");
			}
			System.out.println();
		}
		

	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<List<Integer>> test = new ArrayList<List<Integer>>();
		List<Integer> array;
		
		if(nums.length<3){
			return result;
		}
		Arrays.sort(nums);
		if(nums.length == 3){
			if(nums[0] + nums[1] + nums[2] == 0){
				array = new ArrayList<Integer>();
				array.add(nums[0]);
				array.add(nums[1]);
				array.add(nums[2]);	
				
				result.add(array);
				return result;
			}
			else{return result;}
		}
		
		for(int i = 0; i<=nums.length -3; i++){
			
			int low = i + 1;
			int high = nums.length -1;
			
			while(low < high){
				int sum = nums[i] + nums[low] + nums[high];
				if(sum==0){
					array = new ArrayList<Integer>();
					array.add(nums[i]);
					array.add(nums[low]);
					array.add(nums[high]);
					
					low++;
					high--;
					
					while (low < high && nums[high] == nums[high + 1])
						high--;
 
					while (low < high && nums[low] == nums[low - 1])
						low++;
				}
				else if(sum >0){
					high--;
				}
				else{
					low++;
				}
			}
			
		}
		
		return result;
    }
	
	
public List<List<Integer>> threeSum2(int[] nums) {
		
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	 
	if (nums.length < 3)
		return result;
 
	// sort array
	Arrays.sort(nums);
 
	for (int i = 0; i < nums.length - 2; i++) {
		// //avoid duplicate solutions
		if (i == 0 || nums[i] > nums[i - 1]) {
 
			int negate = -nums[i];
 
			int start = i + 1;
			int end = nums.length - 1;
 
			while (start < end) {
				//case 1
				if (nums[start] + nums[end] == negate) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(nums[i]);
					temp.add(nums[start]);
					temp.add(nums[end]);
 
					result.add(temp);
					start++;
					end--;
					//avoid duplicate solutions
					while (start < end && nums[end] == nums[end + 1])
						end--;
 
					while (start < end && nums[start] == nums[start - 1])
						start++;
				//case 2
				} else if (nums[start] + nums[end] < negate) {
					start++;
				//case 3
				} else {
					end--;
				}
			}
 
		}
	}
 
	return result;
    }

}
