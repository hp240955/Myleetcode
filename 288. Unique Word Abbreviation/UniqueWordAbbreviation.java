
public class UniqueWordAbbreviation {

	public static void main(String[] args) {
		
		/*String [] dictionary = {"deer", "door", "cake", "card","hello"};
		ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
		System.out.println(vwa.isUnique("dear"));
		System.out.println(vwa.isUnique("cart"));
		System.out.println(vwa.isUnique("cane"));
		System.out.println(vwa.isUnique("make"));
		System.out.println();
		System.out.println(vwa.isUnique("hello"));*/
		
		String[] dictionary = {"hello"};
		ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
		
		System.out.println(vwa.isUnique("hello"));
		

	}

}
