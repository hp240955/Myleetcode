import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SummaryRanges {

	public static void main(String[] args) {
		String[] array = {"0","1","2","4","5","7"};
		List<String> test = new ArrayList<String>();
		test.addAll(Arrays.asList(array));
		
		int[] number = {1,3};
		//System.out.println(number[0]);
		
		SummaryRanges hp = new SummaryRanges();
		
		int i = 0;
		hp.summaryRanges(number);
		while(i < hp.summaryRanges(number).size()){
			System.out.println(hp.summaryRanges(number).get(i));
			i++;
		}
		

	}
	
	@SuppressWarnings("null")
	public List<String> summaryRanges(int[] nums) {
		
		List<String> result = new ArrayList<String>();
		if(nums == null || nums.length == 0){
			//result.add("");
		}
		else  {
			
			if(nums.length <= 1){
				result.add("\"" + nums[0]+ "" + "\"");
			}
			else{
				int flag = nums[0];
				ArrayList<Integer> front = new ArrayList<Integer>();
				front.add(flag);
				ArrayList<Integer> back = new ArrayList<Integer>();
		        for(int i = 1; i < nums.length; i++){
		        	if(nums[i] - 1 != nums[i - 1]){
		        		
		        			back.add(nums[i-1]);
		            		front.add(nums[i]);
		        }
		        	if(i == nums.length-1){
		        		back.add(nums[i]);
		        	}
		        }
		        
		        //System.out.println(front.size());
		        //System.out.println(back.size());
		        //System.out.println(front.get(1));
		        //System.out.println(back.get(1));
		        
		        
		        
		        int i = 0;
		        if(front.size() == back.size()){
		        	 while(i < front.size()){
		        		 if(front.get(i).toString().equals(back.get(i).toString()) != true ){
		        			 result.add("\"" + front.get(i) + "->" + back.get(i)+ "\"");
		        		 }
		        		 else{result.add("\"" + back.get(i)+ "" + "\"");}
		        		
		        		 i++;
		        	 } 
		        }
		        else{System.out.println("the size of front and the size of bakc is different");}
			}
			
		}
		
		return result;
    }

}
