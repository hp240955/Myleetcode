import java.util.HashMap;
import java.util.Map;


public class HappyNumber {

	public static void main(String[] args) {
		HappyNumber hp = new HappyNumber();
		
		System.out.println(hp.isHappy(998));
		String s = "143298";
		
		String[] a = s.split("");
		

	}
	
	public boolean isHappy(int n) {
		
		boolean result = false;
		String s = n + "";
		int sum = 0;
		Map <String, Integer> map = new HashMap<String,Integer>();
        while(map.containsKey(s) == false){
        	map.put(s, sum);
        	if(s.equals("1")==false){
        		String[] a = s.split("");
            	for(String i: a){
            		sum = sum + (Integer.parseInt(i) * Integer.parseInt(i));
            	}
            	s = sum + "";
            	System.out.println(s);
            	
            	sum = 0;
        	}
        	else{
        		
        		result = true;
        	}
        	
        }
        
        return result;
    }

}
