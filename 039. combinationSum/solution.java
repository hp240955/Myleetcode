package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {

	public static void main(String[] args) {
		
		int[] candidates = {2,3,6,7};
		int target = 7;
		
		solution hp = new solution();
		//List<List<Integer>> result1 = hp.combinationSum(candidates, target);
		
		for(int i = 0; i < hp.combinationSum(candidates, target).size(); i++){
			for(int j = 0; j< hp.combinationSum(candidates, target).get(i).size(); j++){
				System.out.print(hp.combinationSum(candidates, target).get(i).get(j) + " ");
				
			}
			System.out.println();
		}
		
 
	}
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
		 
		 if(candidates.length == 0 || candidates == null){
	        	return null;
	        }
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        List<Integer> current = new ArrayList<Integer>();
	        
	        Arrays.sort(candidates);
	        
	        combinationSum(candidates, target, 0, current, result);
	        
	        return result;
	       
	    }
	 
	 public void combinationSum(int[] candidates, int target, int j, List<Integer> curr, List<List<Integer>> result){
		   if(target == 0){
		       ArrayList<Integer> temp = new ArrayList<Integer>(curr);
		       result.add(temp);
		       return;
		   }
		 
		   for(int i=j; i<candidates.length; i++){
		       if(target < candidates[i]) 
		            return;
		 
		       curr.add(candidates[i]);
		       combinationSum(candidates, target - candidates[i], i, curr, result);
		       curr.remove(curr.size()-1); 
		   }
		}

}
