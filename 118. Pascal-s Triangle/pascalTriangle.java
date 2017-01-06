import java.util.ArrayList;
import java.util.List;


public class pascalTriangle {

	public static void main(String[] args) {
		
		pascalTriangle hp = new pascalTriangle();
		
		System.out.print(hp.generate(5).get(0));
		//hp.generate(3);
		

	}
	
	 public List<List<Integer>> generate(int numRows) {
		 
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
		 List<Integer> ele = new ArrayList<Integer>();
		 
		 if(numRows == 0){
			 return result;
		 }
		 else{
			 ele.add(1);
			 result.add(ele);	 
			 int i = 1;
			 while(i < numRows){
				 if(i==1){
					 ele = new ArrayList<Integer>();
					 ele.add(1);ele.add(1);
					//System.out.println(ele.size());
					 result.add(ele);
				 }
				 else{
					 //System.out.println(result.size());
					 ele = new ArrayList<Integer>();
					// ele.clear();
					 ele.add(1);
					 //System.out.println(i);
					 //System.out.println(result.get(1).size());
					 int j = 0;
					 while(j<i-1){
						 ele.add((result.get(i-1).get(j) + result.get(i-1).get(j+1)));
						 j++;
					 }
					 ele.add(1);
					 result.add(ele);
				 }  
				 i++;
			 } 
			 
			 return result;
		 }		
	    }

}
