import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;


public class Solution2 {

	public static void main(String[] args) {
		int[] array = {5,5,2,3,1,7,4,3,8,7,6,4,9,7,3};
		//int[]array = {1,2,3};
		List sort = new ArrayList();
		int i =0;
		while(i<array.length){
			sort.add(array[i]);
			i++;
		}
		Arrays.sort(array);
		
		for(int j: array){
			System.out.print(j + " ");
		}
		
		
		//System.out.print(sort.get(14));
		//System.out.println(sort.size());
		
		Solution2 hp = new Solution2();
		System.out.println(hp.containsDuplicate(array));
		//hp.removeDuplicates(array)
	}
	
	public boolean containsDuplicate(int[] nums) {
		boolean check = false;
		if(nums == null || nums.length == 0){
			 check = false;
		}		
		else{
			Arrays.sort(nums);
			int flag = nums[0];
			for(int i =1; i<nums.length; i++){
	        	if(nums[i] != flag){
	        		flag = nums[i];
	        		check = false;
	        	}
	        	else{check = true; break;}
			}	        
	    }
		return check;
	}

	}
