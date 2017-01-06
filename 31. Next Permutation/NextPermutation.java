import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		
		//int[] nums = {6, 5, 4, 8, 7, 5, 1};
		int[] nums = {1, 2};
		NextPermutation hp = new NextPermutation();
		hp.nextPermutation(nums);
		for(int i: nums){
			System.out.print(i + " ");
		}
	}
	
	public void nextPermutation(int[] num) {
        
		int partion = 0;
		int chargeNo = 0; 
		boolean check = false;
		for(int i = num.length-1; i>0; i--){
			if(num[i-1]<num[i]){
				partion = i-1;
				check = true;
				break;
			}
		}
		
		System.out.println(partion);
		
		
		if(partion ==0 && check == false){
			//if(check == false)
				Arrays.sort(num);	
		}
		else{
			for(int i = num.length-1; i>=0; i--){
				if(num[i] > num[partion]){
					chargeNo = i;
					break;
				}
			}
			
			int temp = 0; 
			temp = num[partion];
			num[partion] = num[chargeNo];
			num[chargeNo] = temp;
			
			Arrays.sort(num, partion+1, num.length);
		}
		
    }

}
