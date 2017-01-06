
public class IntegertoRoman {

	public static void main(String[] args) {
		IntegertoRoman hp = new IntegertoRoman();
		System.out.println(hp.intToRoman(3999));

	}
	
	public String intToRoman(int num) {
        int []integer  = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
                "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int i = 0; 
        while(num!=0){
        	if(num>=integer[i]){
        		num-= integer[i];
        		sb.append(roman[i]);
        	}
        	else
        		i++;
        }
        return sb.toString();
    }

}
