import java.util.ArrayList;


public class RotateArray {

	public static void main(String[] args) {
	    int[] array = {1,2,3,4};
	    int k = 7;
	    
	    RotateArray hp = new RotateArray();
	    
	    hp.rotate(array, k);
	    
	    for(int i: array){
	    	System.out.println(i);
	    }
	}
	
	
	public void rotate(int[] nums, int k) {
		
		//if(nums.length >= k){
		
			k = k % nums.length;
			ArrayList<Integer> result = new ArrayList<Integer>();
	        for(int i = (nums.length - k); i < nums.length; i++ ){
	        	result.add(nums[i]);
	        }
	        for(int i = 0; i < nums.length - k; i++){
	        	result.add(nums[i]);
	        }
	        int i = 0;
	        //System.out.println(result.size());
	       // System.out.println("dfd");
	        while(i<nums.length){
	        	nums[i] = result.get(i);
	        	i++;
	        }
		//}
		
		
        
    }

}
