import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class combinationSumIII {

	public static void main(String[] args) {
		int n = 18;
		int k = 2;
		
		combinationSumIII hp = new combinationSumIII();
		//List<List<Integer>> result1 = hp.combinationSum(candidates, n);
		
		for(int i = 0; i < hp.combinationSum3(n, k).size(); i++){
			for(int j = 0; j< hp.combinationSum3(n,k).get(i).size(); j++){
				System.out.print(hp.combinationSum3(n,k).get(i).get(j) + " ");
				
			}
			System.out.println();
		}

	}
	
public List<List<Integer>> combinationSum3(int n, int k){
		
		
		int[] candidates = {1,2,3,4,5,6,7,8,9};
		
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> current = new ArrayList<Integer>();
    //Arrays.sort(candidates);
    
    combinationSum3(candidates, n, 0, current, result, k);
    
    return result;
	}

	public void combinationSum3(int[] candidates, int n, int j, List<Integer> curr, List<List<Integer>> result, int k){
	   if(n == 0){
	       ArrayList<Integer> temp = new ArrayList<Integer>(curr);
	       if(!result.contains(temp) && temp.size() == k)
	       result.add(temp);
	       return;
	   }
	 
	   for(int i=j; i<candidates.length; i++){
	       if(n < candidates[i]) 
	            return;
	 
	       curr.add(candidates[i]);
	       combinationSum3(candidates, n - candidates[i], i+1, curr, result, k);
	       curr.remove(curr.size()-1); 
	   }
	}

}
