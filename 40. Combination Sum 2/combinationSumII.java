import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class combinationSumII {

	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		
		combinationSumII hp = new combinationSumII();
		//List<List<Integer>> result1 = hp.combinationSum(candidates, target);
		
		for(int i = 0; i < hp.combinationSum2(candidates, target).size(); i++){
			for(int j = 0; j< hp.combinationSum2(candidates, target).get(i).size(); j++){
				System.out.print(hp.combinationSum2(candidates, target).get(i).get(j) + " ");
				
			}
			System.out.println();
		}

	}
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target){
		
		if(candidates == null || candidates.length == 0){
			return null;
		}
		
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> current = new ArrayList<Integer>();
    Arrays.sort(candidates);
    
    combinationSum2(candidates, target, 0, current, result);
    
    return result;
	}
	
	public void combinationSum2(int[] candidates, int target, int j, List<Integer> curr, List<List<Integer>> result){
		   if(target == 0){
		       ArrayList<Integer> temp = new ArrayList<Integer>(curr);
		       if(!result.contains(temp))
		       result.add(temp);
		       return;
		   }
		 
		   for(int i=j; i<candidates.length; i++){
		       if(target < candidates[i]) 
		            return;
		 
		       curr.add(candidates[i]);
		       combinationSum2(candidates, target - candidates[i], i+1, curr, result);
		       curr.remove(curr.size()-1); 
		   }
		}

}
