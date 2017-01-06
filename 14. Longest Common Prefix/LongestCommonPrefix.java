
public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		
	}
	
	public String longestCommonPrefix(String[] strs) {
	        
		if(strs == null || strs.length == 0){
			return "";
		}
		if(strs.length==1){
			return strs[0];
		}
		
		String min = strs[0];
		for(String s: strs){
			if(s.length()<min.length()){
				min = s;
			}
		}
		
		for(int i = 0; i < min.length(); i++){
			for(int j = 0; j < strs.length-1; j++){
				String s1 = strs[j];
				String s2 =  strs[j+1];
				if(s1.charAt(i)!=s2.charAt(i)){
					return s1.substring(0, i);
				}
			}
			
		}
		
		return min;
		
			
	}
}
