
public class ImplementStrStr {

	public static void main(String[] args) {
		
	}
	
	public int strStr(String haystack, String needle) {
        
		//return haystack.indexOf(needle);
		
		if(haystack == null || needle == null){
			return -1;
		}
		
		for(int i = 0; i<haystack.length()-needle.length()+1; i++){
			int j = 0;
			for(j = 0; j<needle.length(); j++){
				if(haystack.charAt(i+j)!=needle.charAt(j)){
					break;
				}
			}
			
			if(j==needle.length()) return i;
		}
		
		return -1;
    }

}
