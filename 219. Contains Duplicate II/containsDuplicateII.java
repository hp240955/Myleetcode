import java.util.HashMap;


public class containsDuplicateII {

	public static void main(String[] args) {
		int[] array = {5,10,2,3,1,7,4,5,3,3,8,19,6,4,9,11,18};
		//int[] array = {1,0,1,1};
		//int[] array = {2,3,4,5,2,6,7};
		//int[] array = {5,10,2,3,1,7,4,3};

		containsDuplicateII hp = new containsDuplicateII();
		boolean show = hp.containsNearbyDuplicate(array, 4);
		System.out.println(show);
	}
	
	public boolean containsNearbyDuplicate2(int[] nums, int k) {
		boolean check = false;
		
		if(nums == null || nums.length == 0 || nums.length==1 ){
			check = false;
		}
		else{
			//int j = 1;
			for(int i = 0; i<nums.length; i++){
				
				if(check ==true){
					break;
				}
				
				for(int j = 1; j <=k; j++){
					if(i+j<=nums.length-1){
						if(nums[i] == nums[i+j]){
							check = true;
							break;
						}
					}
					
				}
				/*while(j <= k && i+j<=nums.length-1){
					if(nums[i] == nums[i+j]){
						check = true;
						break;
					}
					j++;
				}*/
				
			}
		}

		return check;
	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		//int min = Integer.MAX_VALUE;
		boolean check = false;
		
		for(int i = 0; i<nums.length; i++){
			
			if(map.containsKey(nums[i])){
				int index = map.get(nums[i]);
				if(i-index <= k){
					check = true;
					break;
				}
				else{check = false;}
				
			}
				
			map.put(nums[i], i);
		}
		return check;
		

    }

}
