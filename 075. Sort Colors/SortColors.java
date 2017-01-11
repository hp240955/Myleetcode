import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortColors {

	public static void main(String[] args) {
	 int[] nums = {1};
	 SortColors hp = new SortColors();
	 hp.sortColors(nums);
	 for(int i: nums){
		 System.out.println(i);
	 }
	}
	
	 public void sortColors(int[] nums) {
	        int[] countArray = new int[3];
	        for(int i = 0; i < nums.length;i++){
	        	countArray[nums[i]]++;
	        }
	        
	       // int[] sort = new int[nums.length];
	        ArrayList<Integer>result = new ArrayList<Integer>();
	        
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i =0; i < countArray.length; i++){
	        	map.put(i, countArray[i]);
	        }
	        
	        for(int i = 0; i <countArray.length; i++){
	        	for(int j = 0; j < map.get(i); j++){
	        		result.add(i);
	        	}
	        }
	        
	       for(int i = 0; i<nums.length; i++){
	    	   nums[i]= result.get(i);
	       }
	    }

}
