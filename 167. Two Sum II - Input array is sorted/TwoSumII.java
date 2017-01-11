import java.util.HashMap;

public class TwoSumII {

	public static void main(String[] args) {

		int[] nums = {2, 7, 11, 15};
		TwoSumII hp = new TwoSumII();
		for(int i: hp.twoSum(nums, 9)){
			System.out.println(i);
		}
	}
	
	
	
	public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i = 0; i<numbers.length; i++){
        	int com = target - numbers[i];
        	if(map.containsKey(com)){
        		result[0] = map.get(com)+1;
        		result[1] = i+1;
        	}
        	if(!map.containsKey(numbers[i]))
        		map.put(numbers[i], i);
        	
        }
        
        return result;
    }

}
