
public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome hp = new ValidPalindrome();
		
		System.out.println(hp.isPalindrome("0P"));
		
	}
	
	public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder();
        sb.append(s);
     
        return s.equalsIgnoreCase(sb.reverse().toString());
    }

}
