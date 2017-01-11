
public class addDigits {

	public static void main(String[] args) {
		addDigits hp = new addDigits();
		
		System.out.println(hp.addDigits(38));

	}
	
	 public int addDigits(int num) {
	    if(num == 0) return 0;
		if(num%9 == 0) return 9;
		
		return num%9;

}
	 
}
