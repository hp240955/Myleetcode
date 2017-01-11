
public class ShortestWordDistanceII {

	public static void main(String[] args) {
		
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		WordDistance wordDistance = new WordDistance(words);
		System.out.println(wordDistance.shortest("coding", "makes"));
		System.out.println(wordDistance.shortest("practice", "coding"));
	}

}
