 
public class ReverseVowelsString {

	public static void main(String[] args) {
	
		ReverseVowelsString hp = new ReverseVowelsString();
		System.out.println(hp.reverseVowels("leetcode"));
		
	}
	
	public String reverseVowels(String s) {
		/*StringBuilder sb = new StringBuilder();
        for(int i=0; i< s.length(); i++){
        	if(checkVowels(s.charAt(i))){
        		sb.append(s.charAt(i));
        	}
        }*/
		int low = 0; int high = s.length()-1;
		char[] chars = s.toCharArray();
		while(high>=low){
			char h = chars[high];
			char l = chars[low];
			if(checkVowels(h)&&checkVowels(l)){
				chars[high] = l;
				chars[low] = h;	
				high--;
				low++;
			}
			else if(!checkVowels(h)&&checkVowels(l)){
				high--;
			}
			else if(checkVowels(h)&&!checkVowels(l)){
				low++;
			}
			else{
				high--;
				low++;
			}
		}
		
		return new String(chars);
        
    }
	
	public boolean checkVowels(char c){
		switch(c){
		case 'o': return true;
		case 'e': return true;
		case 'i': return true;
		case 'a': return true;
		case 'u': return true;
		case 'O': return true;
		case 'E': return true;
		case 'I': return true;
		case 'A': return true;
		case 'U': return true;
		default: return false;
		}
	}

}
