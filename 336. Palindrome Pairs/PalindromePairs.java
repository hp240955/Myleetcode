import java.util.ArrayList;
import java.util.List;


public class PalindromePairs {

	public static void main(String[] args) {
		String[] words = {"abcd", "dcba", "lls", "s", "sssll"};
		PalindromePairs hp = new PalindromePairs();
		System.out.println(hp.palindromePairs(words));

	}
	
	public List<List<Integer>> palindromePairs(String[] words) {
		
		List<List<Integer>> result =  new ArrayList<List<Integer>>();
        for(int i=0; i<words.length; i++){
        	int j = i+1; 
        	
        	while(j<words.length){
        		if(isPalindrome(words[i],words[j])){
        			ArrayList<Integer> ele1 = new ArrayList<Integer>();
        			ele1.add(i);ele1.add(j);
        			result.add(ele1);
        		}
        		
        		if(isPalindrome(words[j],words[i])){
        			ArrayList<Integer> ele2 = new ArrayList<Integer>();
        			ele2.add(j);ele2.add(i);
        			result.add(ele2);
        		}
        		j++;
        	}
        }
        
        return result;
		
    }
	
	public boolean isPalindrome(String s1, String s2) {
		String s = s1+s2;
		StringBuilder input =  new StringBuilder();
		input.append(s);
		input = input.reverse();
		
		if(s.equals(input.toString())){
			return true;
		}
		
		return false;	 
	}

}
