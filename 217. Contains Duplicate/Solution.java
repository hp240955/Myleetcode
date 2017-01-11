
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Solution {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int[] array = {5,5,2,3,1,7,4,3,8,7,6,4,9,7,3};
		//int[]array = {};
		List sort = new ArrayList();
		int i =0;
		while(i<array.length){
			sort.add(array[i]);
			i++;
		}
		Collections.sort(sort);
		
		
		//System.out.print(sort.get(14));
		//System.out.println(sort.size());
		
		Solution hp = new Solution();
		System.out.println(hp.containsDuplicate(array));
		//hp.removeDuplicates(array)

	}
	
public boolean containsDuplicate(int[] nums) {
	
	boolean check = false; 
        //for(int i = 0; i < nums.length; i++){
	   int i =  0;
		while(check == false && i< nums.length){
        	for(int j = i+1; j<nums.length; j++){
        		if(nums[i] == nums[j]){
        			check = true;
        			break;
        		}
        		else check = false;
        	}
        	i++;
        }
        
        return check;
    }

}
