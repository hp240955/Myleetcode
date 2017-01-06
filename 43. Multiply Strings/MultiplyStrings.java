
public class MultiplyStrings {

	public static void main(String[] args) {
		
	
		MultiplyStrings hp = new MultiplyStrings();
		System.out.println(hp.multiply("423", "43"));
	}
	
	public String multiply(String num1, String num2) {
        
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
		if(num1.equals("0") || num2.equals("0")){
			return "0";
		}
		int n1 = num1.length();
		int n2 = num2.length();
		int digit = 0; 
		int[] array = new int[n1+n2];
		//int carry = 0;
		int temp = 0;
		for(int i = 0; i<n1; i++){
			for(int j = 0; j<n2; j++){
				digit = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				temp = array[i+j];
				array[i+j] = (temp+digit)%10;
				//carry = (temp+digit+carry)/10;
				array[i+j+1] += (temp+digit)/10;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = array.length-1; i>=0;i--){
			if(sb.length()==0&&array[i] == 0)
				continue;
			sb.append(array[i]);
		}
		return sb.toString();
    }

}
