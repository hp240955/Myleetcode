import java.util.HashMap;
import java.util.Map;


public class StrobogrammaticNumber {

	public static void main(String[] args) {
		StrobogrammaticNumber hp = new StrobogrammaticNumber();
		String s ="7777";
		System.out.println(hp.isStrobogrammatic(s));

	}
	
	public boolean isStrobogrammatic(String num) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('0', '0');
		map.put('1', '1');
		map.put('8', '8');
		map.put('6', '9');
		map.put('9', '6');
		
		int i = 0; int j = num.length()-1;
		while(i<=j){
			char c = num.charAt(i);
			if(!map.containsKey(c)){
				return false;
			}
			if(map.get(c)!=num.charAt(j)){
				return false;
			}
			
			i++;
			j--;
		}
		return true;
		
	}

}
