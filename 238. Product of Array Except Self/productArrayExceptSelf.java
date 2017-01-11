
public class productArrayExceptSelf {

	public static void main(String[] args) {
		//int[] array = {1,2,3,4};
		//int[] array = {1,2,3,0,5,3,0,2};
		int[] array = {1,0};
		productArrayExceptSelf hp = new productArrayExceptSelf();
		
		for(int i: hp.productExceptSelf(array)){
			System.out.print(i + " ");
		}

	}
	
	
	public int[] productExceptSelf(int[] nums) {
        
		int sum = 1;
		int[] result = new int[nums.length];
		
		 if(nums == null || nums.length == 0){
				
				return result;
			}
		
		int count0 = 0;
		
		for(int i: nums){
			
			if(i == 0){
				count0++;
			}
			
		}
		
		if(count0 == 0){
			for(int i: nums){
				sum = sum * i;
			}
			for(int i = 0; i<nums.length; i++){
				result[i] = sum / nums[i];
			}
			
		}
		else if(count0 == 1){
			for(int i: nums){
				if(i == 0){
					continue;
				}
				sum = sum * i;	
			}
			//System.out.println(sum);
			for(int i = 0; i<nums.length; i++){
				if(nums[i] == 0){
					result[i] = sum;
				}
				else{
					result[i] = 0;
				}
			}
		}
		
		else{
			return result;
		}
		
		
		return result;
    }

}
