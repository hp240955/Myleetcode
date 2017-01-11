import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class RepeatedDNAsequences {

	public static void main(String[] args) {
		

		//String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		String s = "AAAAAAAAAAA";
		System.out.println(s.substring(0, 10));
		RepeatedDNAsequences hp = new RepeatedDNAsequences();
		System.out.println(hp.findRepeatedDnaSequences(s));
	}
	
	public List<String> findRepeatedDnaSequences(String s) {
	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	        List<String> key = new ArrayList<String>();
	        for(int i =0; i<s.length()-9; i++){
	        	String h = s.substring(i,i+10);
	        	if(map.containsKey(h)){
	        		map.put(h, map.get(h)+1);
	        	}
	        	else{
	        		key.add(h);
	        		map.put(h, 1);
	        	}
	        }
	        List<String> result = new ArrayList<String>();
	        for(String p: key){
	        	if(map.get(p)>1){
	        		result.add(p);
	        	}
	        }
	        return result;
	        
	    }

}
