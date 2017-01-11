
public class ReverseString {

	public static void main(String[] args) {
		
		ReverseString hp = new ReverseString();
		System.out.println(hp.reverseString("hello"));
		
	}
	
	 public String reverseString(String s) {
	        
		 StringBuilder sb = new StringBuilder();
		 sb.append(s);
		 return sb.reverse().toString();
	    }

}
