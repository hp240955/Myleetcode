
public class RomantoInteger {

	public static void main(String[] args) {
	
		RomantoInteger hp = new RomantoInteger();
		System.out.println(hp.romanToInt("MCMLXXVI"));
	}
	
	public int romanToInt(String s) {
        
		int temp = getValue(s.charAt(0)); 
		int pre = getValue(s.charAt(0)); 
		int current = 0; 
		int result = 0; 
		char c; 
		
		for(int i = 1; i<s.length(); i++){
			c = s.charAt(i);
			current = getValue(c);
			if(current == pre){
				temp += current;
			}
			else if(current> pre){
				temp = (current - pre);
				pre = current;
			}
			else{
				result += temp;
				temp = current;
				pre = current;
			}	
			
		}
		result += temp;
		return result;
		
    }
	
	public int getValue(char c){
		switch(c){
		case 'I': return 1;
		case 'V': return 5;    
	    case 'X': return 10;    
	    case 'L': return 50;    
	    case 'C': return 100;    
	    case 'D': return 500;    
	    case 'M': return 1000;  
	    default: return 0;  
		}
	}
	

}
