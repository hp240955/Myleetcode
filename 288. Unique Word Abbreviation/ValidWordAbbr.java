import java.util.HashMap;


public class ValidWordAbbr {
	
	private HashMap<String, String> map = new HashMap<String, String>();
	private StringBuffer buffer = new StringBuffer();
	

	 public ValidWordAbbr(String[] dictionary) {
	        
		 for(String s: dictionary){
			 if(s.length()<3){
				 map.put(s, s);
			 }
			 else{
				 buffer.append(s.charAt(0));
				 int count =(s.length()-2);
				 buffer.append(count);
				 buffer.append(s.charAt(s.length()-1));
				 System.out.println(buffer.toString());
				 map.put(buffer.toString(), s);
				 buffer.delete(0, buffer.length());
			 }
			
		 }
		 
	    }

	    public boolean isUnique(String word) {
	    	if(word.length()<3){
	    		if(map.containsKey(word)){
		    		if(map.get(word).equals(word)){
		    			return true;
		    		}
	    			return false;
		    	}
	        }
	       else
	       {String givenWord = ""+ word.charAt(0) + (word.length() -2) +word.charAt(word.length()-1);
		    	
		    	if(map.containsKey(givenWord)){
		    		if(map.get(givenWord).equals(word)){
		    			return true;
		    		}
		    		return false;
		    	}
		    	
	       }
		    	
		    	return true;
	    }
}
