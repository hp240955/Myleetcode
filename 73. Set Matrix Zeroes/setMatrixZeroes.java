import java.util.ArrayList;


public class setMatrixZeroes {

	public static void main(String[] args) {
		//int[][] matrix = {{1,2,3,4,7}, {5,6,0,8,8}, {9,2,1,7,1}, {5,7,8,2,0}};
		int[][] matrix = {{0,0,0,5}, {4,3,1,4}, {0,1,1,4}, {1,2,1,3}, {0,0,1,1}};
		setMatrixZeroes hp = new setMatrixZeroes();
		hp.setZeroes(matrix);
		for(int i =0; i<matrix.length; i++){
			for(int j = 0; j< matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}

	}
	
	public void setZeroes(int[][] matrix) {
        
		boolean firstRow = false;
		boolean firstCol = false;
		
		for(int i = 0; i < matrix[0].length; i++){
			if(matrix[0][i] == 0){
				firstRow = true;
				break;
			}
		}
		
		for(int i = 0; i < matrix.length; i++){
			if(matrix[i][0] == 0){
				firstCol = true;
				break;
			}
		}
		
		for(int i = 1; i<matrix.length; i++){
			for(int j = 1; j<matrix[0].length; j++){
				if(matrix[i][j] == 0){
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for(int i = 0; i<matrix[0].length; i++){
			if(matrix[0][i] == 0){
				for(int j = 0; j< matrix.length; j++){
					matrix[j][i] = 0;
				}
			}
		}
		
		for(int i = 0; i< matrix.length; i++){
			if(matrix[i][0] == 0){
				for(int j = 0; j< matrix[0].length; j++){
					matrix[i][j] = 0;
				}
			}
		}
		
		if(firstRow == true){
			for(int i = 0; i<matrix[0].length; i++){
				matrix[0][i] = 0;
			}
		}
		
		if(firstCol == true){
			for(int i = 0; i<matrix.length; i++){
				matrix[i][0] = 0;
			}
		}

    }

}
