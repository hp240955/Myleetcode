import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		ValidParentheses hp = new ValidParentheses();
		System.out.println(hp.isValid("([])"));
	}

	 public boolean isValid(String s) {
	        
		 HashMap<Character, Character>map = new HashMap<Character, Character>();
		 map.put('(', ')');
		 map.put('[', ']');
		 map.put('{', '}');
		 
		 Stack<Character> stack = new Stack<Character>();
		 
		 for(int i = 0; i<s.length(); i++){
			 char c = s.charAt(i);
			 
			 if(map.containsKey(c)){
				 stack.push(c);
			 }
			 else if(map.containsValue(c)){
				 if(stack.isEmpty()) return false;
				 else{
					 if(map.get(stack.peek()) == c){
						 stack.pop();
					 }
					 else return false; 
				 }
			 }
		 }
		 
		 if(!stack.isEmpty()) return false;
		 
		 return true;
	    }
}
