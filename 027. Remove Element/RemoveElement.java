import java.util.ArrayList;


public class RemoveElement {

	public static void main(String[] args) {
		int[] array = {4,5};
		RemoveElement hp = new RemoveElement();
		System.out.println(hp.removeElement(array, 4));
		
	}
	
	 public int removeElement(int[] nums, int val) {
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        ArrayList<Integer> array = new ArrayList<Integer>();
	        for(int i : nums){
	        	result.add(i);
	        }
	        for(int i = 0; i<result.size(); i++){
	        	if(result.get(i) == val){
	        		continue;
	        	}
	        	else{array.add(result.get(i));}
	        }
	        
	        
	        return array.size();
	    }

}
