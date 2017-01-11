import java.util.ArrayList;


public class search2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,50}};
		search2DMatrix hp = new search2DMatrix();
		
		System.out.println(hp.searchMatrix(matrix, 3));

	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
        boolean check = false;
        
        ArrayList<Integer>array = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j< matrix[0].length; j++){
        		array.add(matrix[i][j]);
        	}
        }
        
        int low = 0;
        int high = array.size() -1;
        
        while(low <= high){
        	int middle = (low+high)/2;
        	if(target == array.get(middle)){
        		check = true;
        		return check;
        	}
        	else if(target <array.get(middle)){
        		high = middle -1; 
        	}
        	else{
        		low = middle + 1;
        	}
        }
        
        return check;
        
		
    }

}
