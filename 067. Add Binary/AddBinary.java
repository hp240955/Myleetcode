
public class AddBinary {

	public static void main(String[] args) {
	
		AddBinary hp = new AddBinary();
		System.out.println(hp.addBinary("1", "1"));
		//System.out.println("100101".charAt(3));
	}
	
	public String addBinary(String a, String b) {
    
		a = new StringBuilder(a).reverse().toString();
		b = new StringBuilder(b).reverse().toString();
		//int one = Integer.parseInt(a);
		//int two = Integer.parseInt(b);
		String longerString = "";
		String shorterString = "";
		if(a.length()>b.length()){
			longerString = a;
			shorterString = b;
		}
		else{
			longerString = b;
			shorterString =a;
		}
		
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		for(int i = 0; i<longerString.length(); i++){
			if(i<shorterString.length()){
				int one = Integer.valueOf(a.charAt(i)+"");
				int two = Integer.valueOf(b.charAt(i)+"");
				int sum = one + two + carry;
				if(sum>1){
					if(sum>2){
					sb.append(1);	
					}
					else{
					sb.append(0);
					}
					carry = 1;
				}
				else{
					sb.append(sum);
					carry = 0;
				}					
			}
			else{
				if(carry == 0){
					sb.append(longerString.charAt(i));
				}
				else{
					
					int sum = Integer.valueOf(longerString.charAt(i)+"") + carry;
					System.out.println(sum);
					if(sum > 1){
						
						sb.append(0);
						carry = 1;
						if(i == longerString.length()-1)
							sb.append(1);
					}
					else{
						sb.append(sum);
						carry = 0;
					}
				}
			}
		}
		
		return sb.reverse().toString();
    }

}
