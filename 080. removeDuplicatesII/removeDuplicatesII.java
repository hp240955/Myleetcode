package removeDuplicatesII;

public class removeDuplicatesII {

	public static void main(String[] args) {
		//int[] array = {1,1,1,2,2,3};
		int[] array = {1,1,1,1,3,3};
		removeDuplicatesII hp = new removeDuplicatesII();
		
		System.out.println(hp.removeDuplicates(array));

	}
	
	public int removeDuplicates(int[] nums) {
        int countLen =0;
        int count = 0;
        
        if(nums == null || nums.length == 0){
			countLen = 0;
			return countLen;
		}
        else{
        	int flag = nums[0];
	        count = 1;
	        countLen = 1;
	        for(int i =1; i<nums.length; i++){
	        	if(nums[i] == flag){
	        		
	        		if(countLen >=2){
	        			continue;
	        		}
	        		else{
	        			countLen++;
	        			count++;
	        		}
	        	}
	        	else{
	        		flag = nums[i];
	        		count++;
	        		countLen = 1;
	        		//nums[count -1] = flag;
	        	}
	        }
        }
        
        return count;
        
    }

}
