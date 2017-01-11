import java.util.Arrays;


public class HIndex {

	public static void main(String[] args) {
		
		int[] citations = {1};
		HIndex hp = new HIndex();
		System.out.println(hp.hIndex(citations));

	}
	
	public int hIndex(int[] citations) {
        
		Arrays.sort(citations);
		int count = 0; 
		
		for(int i = citations.length-1; i>=0; i--){
			if(count>=citations[i]){
				return Math.max(count, citations[i]);
			}
			count++;
		}
		
		return count;
    }

}
