import java.util.HashMap;


public class BullsAndCows {

	public static void main(String[] args) {
		
		String secret = "1122";
		String guess = "2211";
		
		//String secret = "1123";
		//String guess = "0111";
		
		
		BullsAndCows hp = new BullsAndCows();
		System.out.println(hp.getHint(secret, guess));
		
	}
	
	
	 public String getHint(String secret, String guess) {
	        
		 int countA = 0;
		 int countB = 0;
		 
		 HashMap<Integer, Integer> Smap = new HashMap<Integer, Integer>();
		 HashMap<Integer, Integer> Gmap = new HashMap<Integer, Integer>();
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 
		 for(int i = 0; i<secret.length(); i++){
			 Smap.put(i, (int)secret.charAt(i));
			 Gmap.put(i, (int)guess.charAt(i));
		 }
		 
		 for(int j = 0; j<secret.length(); j++){
			 if(Smap.get(j) == Gmap.get(j)){
				 countA++;
			 }
			 else{
				 if(map.containsKey(Smap.get(j))){
					 map.put(Smap.get(j), map.get(Smap.get(j))+1);
				 }
				 else{map.put(Smap.get(j), 1);}
			 }
		 }
		 
		 for(int k = 0; k < secret.length(); k++){
			 if(Smap.get(k) != Gmap.get(k)){
				 if(map.containsKey(Gmap.get(k))){
					 countB++;
					 if(map.get(Gmap.get(k)) == 1){
						 map.remove(Gmap.get(k));
					 }
					 else{
						 int freq = map.get(Gmap.get(k)) - 1;
						 map.put(Gmap.get(k), freq);
					 }
				 }
			 }
		 }
		 
		 return countA+"A"+countB +"B";
		 
	    }
}
