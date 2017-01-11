
public class LengthLastWord {

	public static void main(String[] args) {
		LengthLastWord hp = new LengthLastWord();
		System.out.println(hp.lengthOfLastWord("a  "));
	}
	
	public int lengthOfLastWord(String s) {
	    String []a=s.split(" ");  
	    if (a==null||a.length==0)  
	    {  
	        return 0;  
	    }  
	    else  
	    {  
	        int output=a[a.length-1].length();  
	        return output;  
	    }  
    }

}
