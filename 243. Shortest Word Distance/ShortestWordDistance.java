
public class ShortestWordDistance {

	public static void main(String[] args) {
		String[] s = {"practice", "makes", "perfect", "coding", "makes"};
		
		String word1 = "coding"; String word2 = "makes";
		ShortestWordDistance hp = new ShortestWordDistance();
		
		System.out.println(hp.shortestDistance(s, word1, word2));

	}
	
public int shortestDistance(String[] words, String word1, String word2) {
        
	int flagIndex = 0; int distance = Integer.MAX_VALUE;String s ="";
	
	for(int i = 0; i<words.length; i++){
		if(words[i].equals(word1)||words[i].equals(word2)){
			if(s.equals("")){
				s = words[i];
				flagIndex = i;
				continue;
			}
			if(words[i].equals(s)){
				flagIndex = i;
			}
			else{
				s = words[i];
				distance = Math.min(i - flagIndex, distance);
				flagIndex = i;
			}
			
		}
	}
	
	return distance;
    }

}
