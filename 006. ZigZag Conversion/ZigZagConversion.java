
public class ZigZagConversion {

	public static void main(String[] args) {
		
		ZigZagConversion hp = new ZigZagConversion();
		//String s="PAYPALISHIRING";
		String s = "PAYPALISHIRING";
		int numRows = 4;//PAHNAPLSIIGYIR
		System.out.println(hp.convert(s, numRows));
	}
	
	 public String convert(String s, int numRows) {	
		 if(numRows == 1)
    		 return s;
		 
		 StringBuilder sb = new StringBuilder();
		 int step = numRows * 2 - 2; 
		 //int index  =0;
		 for(int i = 0; i<numRows; i++){
			 
			if(i ==0 || i == numRows-1){
				for(int j = i; j<s.length(); j= j+step){
					sb.append(s.charAt(j));
				}
			}
			
			else{
				//int index = 0;
				for(int j=i; j<s.length(); j = j+(2*numRows-2-2*i)){
					if(j< s.length())
						sb.append(s.charAt(j));
				}
			}
		 }
		 
		 return sb.toString();
		 
	    }

}
