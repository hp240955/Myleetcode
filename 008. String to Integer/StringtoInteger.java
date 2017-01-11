
public class StringtoInteger {

	public static void main(String[] args) {
		
		//String s = "0099";
		//System.out.println(Double.parseDouble(s));
		
		StringtoInteger hp = new StringtoInteger();
		System.out.println(hp.myAtoi("+"));
	}
	
	 public int myAtoi(String str) {
		 if (str == null || str.length() == 0) return 0;  
		 str = str.trim();
		 boolean sign = false;
		 int i = 1;
		 if(str.charAt(0) == '+'){
			 sign = true;
		 }
		 else if (str.charAt(0) == '-'){
			 sign = false;
		 }
		 else{
			 i = 0;
		 }
		 
		 double tmp = 0.0;
		// int temp = 0;	
		 for(; i<str.length(); i++){
			 int digit = str.charAt(i) - '0';  
             
	            if (digit < 0 || digit > 9) break;  
	              
	            // 5. handle min & max  
	            if (sign) {  
	                tmp = 10*tmp + digit;  
	                if (tmp > Integer.MAX_VALUE) return Integer.MAX_VALUE;  
	            } else {  
	                tmp = 10*tmp - digit;  
	                if (tmp < Integer.MIN_VALUE) return Integer.MIN_VALUE;  
	            }  
		 }
		 return (int)tmp;
	    }
}
