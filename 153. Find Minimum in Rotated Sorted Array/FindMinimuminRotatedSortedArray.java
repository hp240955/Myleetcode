import java.util.Arrays;

public class FindMinimuminRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		FindMinimuminRotatedSortedArray hp = new FindMinimuminRotatedSortedArray();
		System.out.println(hp.findMin(nums));
	}
	
	public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

}
