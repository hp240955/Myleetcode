
public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		//int [] nums = {4, 5, 6, 7, 0, 1, 2};
		int[] nums = {1, 3};
		SearchinRotatedSortedArray hp = new SearchinRotatedSortedArray();
		System.out.println(hp.search(nums, 3));
	}
	
	public int search(int[] nums, int target) {
	    
		
		int result = -1;
		int low = 0; int high = nums.length-1;
		int pivot = findPivotIndex(nums);
		if(pivot == 0){
			return binarySearch(target, low, high, nums);
		}
		else{
			if(target == nums[0]){
				return 0;
			}
			else if(target > nums[0]){
				high = pivot-1; 
				result = binarySearch(target, low, high, nums);
			}
			else if (target<nums[0]){
			
				low = pivot;
				result = binarySearch(target, low, high, nums);
			}
		}
		
		
		return result;
		
	    }
	
	public int findPivotIndex(int[]nums){
		
		int index = 0; int temp = nums[0];
		for(int i = 1; i<nums.length; i++){
			if(nums[i]<temp){
				index = i;
				break;
			}
			temp = nums[i];
		}
		return index;
	}
	
	 public int binarySearch(int key, int low, int high, int[] data) 
	     {
	           
	          while(high >= low) {
	              int middle = (low + high) / 2;
	              if(data[middle] == key) {
	                  return middle;
	              }
	              if(data[middle] < key) {
	                  low = middle + 1;
	              }
	              if(data[middle] > key) {
	                  high = middle - 1;
	              }
	         }
	         return -1;
	    }	

}
