
public class CountPrimes {

	public static void main(String[] args) {
		CountPrimes hp = new CountPrimes();
		
		System.out.println(hp.countPrimes(9));

	}
	
	 public int countPrimes(int n) {
	     int count = 0;
	     
	     for(int i = 2; i< n; i++){
	    	 if(isPrime(i)){
				 count++;
			 }
	     }
		
		 
		 return count;
			 
	 }
	 
	 public boolean isPrime(int n){
		 //boolean s = false;
		 if(n<=1)
			 return false;
		 
		 else{
			 for(int i =2; i <=n/2; i++){
				 if(n%i == 0)
					 return false;
			 }
		 }
		 
		 return true;
	 }
	 
	 
	

}
