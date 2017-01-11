import java.util.ArrayList;
import java.util.List;


public class pascalTriangle2 {

	public static void main(String[] args) {
		pascalTriangle2 hp = new pascalTriangle2();
		
		System.out.print(hp.getRow(0));
		//hp.generate(3);
	}
	
		public List<Integer> getRow(int rowIndex) {
        
			 List<Integer> ele = new ArrayList<Integer>();
			 List<Integer> temp = new ArrayList<Integer>();
			 if(rowIndex < 0){
				 return ele;
			 }
			 else{
				 ele.add(1);
				 temp = ele;
				 int i =1;
				 while(i <= rowIndex){
				 if(i==1){
					 ele = new ArrayList<Integer>();
					 ele.add(1);ele.add(1);
					 temp.clear();
					 temp = ele;
				 }
				 else{
					 ele = new ArrayList<Integer>();
					 ele.add(1);
					 int j = 0;
					 while(j<i-1){
						 ele.add((temp.get(j) + temp.get(j+1)));
						 j++;
					 }
					 ele.add(1);
					 temp.clear();
					 temp = ele;
				 }
				 i++;
				 }
				 
			 }
			 return ele;
			 
    }

}
