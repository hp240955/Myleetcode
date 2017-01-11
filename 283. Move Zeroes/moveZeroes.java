
public class moveZeroes {

	public static void main(String[] args) {
		
		int[] array = {0, 1, 0, 3, 12};
		
		for(int i: array){
			System.out.print(i + " ");
		}
		moveZeroes hp = new moveZeroes();
		hp.moveZeroes(array);
		for(int i: array){
			System.out.print(i + " ");
		}
	}
	
	
	public void moveZeroes(int[] nums) {
        
		if(nums==null || nums.length == 0){
			return;
		}
	
		int i = 0; int j =0;
		while(j<nums.length){
			if(nums[j] != 0){
				swap(i,j,nums);
				i++;
			}
			
			j++;
		}
		
    }
	
	
	public void swap(int i, int j, int[]nums){
		int temp;
		temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
