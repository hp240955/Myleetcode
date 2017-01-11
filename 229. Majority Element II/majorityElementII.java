import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class majorityElementII {

	public static void main(String[] args) {
				int [] array = {1,3,3,3,3,2,3,4,3,2,2};
				//int[] array = {3,2,3};
				//int[] array = {1,2,2,2};
				majorityElementII hp = new majorityElementII();
				
				//System.out.println(hp.majorityElement(array));
				for(int i: hp.majorityElement(array)){
					System.out.print(i + " ");
				}

	}
	
	 public List<Integer> majorityElement(int[] nums) {
	        
		 
		 
		 List<Integer> result = new ArrayList<Integer>();
		 
		 if(nums==null || nums.length == 0){
				return result;
			}
		 Arrays.sort(nums);
		 int n = nums.length /3;
		 int count = 0;
		 int flag = nums[0];
		 int end = nums[nums.length-1];
		 
		 if(nums.length ==1){
			 result.add(nums[0]);
		 }
		 
		 else{
			 if(nums[0] == end){
				 result.add(nums[0]);
				 return result;
			 }
			 for(int i = 0; i< nums.length; i++){
				 if(nums[i] == flag){
					 count++;
				 }
				 else if(nums[i] != flag){
					 if(i!=nums.length-1){
						 
					 }
				 }
			 }
		 }
		
		 return result;
		 
		 
	    }

}
