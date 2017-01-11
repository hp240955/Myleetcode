import java.util.Arrays;

public class majorityElement {

	public static void main(String[] args) {
		//int [] array = {1,3,3,3,3,2,3,4,3,2,2};
		//int[] array = {3,2,3};
		int[] array = {2,2};
		majorityElement hp = new majorityElement();
		
		System.out.println(hp.majorityElement2(array));

	}
	
	public int majorityElement(int[] nums) {
        
		Arrays.sort(nums);
		//for(int j: nums){System.out.print(j + " ");}
		
		int m = nums.length/2;
		int flag = nums[0];
		int count = 0;
		int ele = 0;
		
		if(nums.length == 1){
			ele = nums[0];
		}
		else{
			for(int i =0; i<nums.length; i++){
				count++;
				
	        	if(nums[i] != flag){
	        		if(count-1 > m){
	        			//System.out.println(count);
	        			ele = flag;	
	        			break;
	        		}
	        		else{
	        		      count = 0;
	        		}
	        		
	        		flag = nums[i];
	        	}
	        	
	        	if(count-1>=m){
	        		ele = flag;
	        	}
	        	
			}
		}
	
		return ele;
    }
	
	public int majorityElement2(int[] nums) {
        
		Arrays.sort(nums);
		//for(int j: nums){System.out.print(j + " ");}
		
		int m = nums.length/2;
		int flag = nums[0];
		int count = 0;
		int ele = 0;
		
		if(nums.length == 1){
			ele = nums[0];
		}
		
		else{
			for(int i =0; i<nums.length; i++){
				if(nums[i] == flag){
					count++;
					if(count >=m){
						ele=nums[i];
					}
				}
				else{
					count = 0;
					flag = nums[i];
				}
	        	
			}
		}
	
		return ele;
    }

}
