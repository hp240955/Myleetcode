
public class ClimbingStairs {

	public static void main(String[] args) {
		ClimbingStairs hp =  new ClimbingStairs();
		
		System.out.println(hp.climbStairs2(4));

	}
	
	public int climbStairs1(int n) {
        if(n==1||n<=0) return 1;
        int result = climbStairs1(n-1) + climbStairs1(n-2);
        return result;
    }
	
	public int climbStairs2(int n) {
		  int[] ways = {1, 1};  
	        for (int i = 1; i < n; i++) {  
	            int temp = ways[1];  
	            ways[1] += ways[0];  
	            ways[0] = temp;  
	        }  
	        System.out.println(ways[0]);
	        return ways[1];  
	        
	        /*
	           if (!n) return 1;
        int prev1 = 0, prev2 = 1, now = 1;
        for (int i = 2; i <= n; ++i) {
            prev1 = prev2;
            prev2 = now;
            now = prev1 + prev2;
        }
        return now;
	         */
    }

}
