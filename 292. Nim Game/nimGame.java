
public class nimGame {

	public static void main(String[] args) {
		
		nimGame hp = new nimGame();
		
		System.out.println(hp.canWinNim(4));
	}
	
	
	public boolean canWinNim(int n) {
        if(n%4==0){
        	return false;
        }
        return true;
    }

}
