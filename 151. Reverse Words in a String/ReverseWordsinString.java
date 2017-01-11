
public class ReverseWordsinString {

	public static void main(String[] args) {
		ReverseWordsinString hp = new ReverseWordsinString();
		System.out.println(hp.reverseWords("a    b"));
	}
	
	public String reverseWords(String s) {
        
	 s = s.trim();
	 String[] sArray = s.split("\\s+");
	 StringBuilder sb = new StringBuilder();
	 for(int i = sArray.length-1; i>=0; i--){
		 sb.append(sArray[i].trim());
		 sb.append(" ");
	 }
	 
	 return sb.toString().trim();
	 
    }

}
