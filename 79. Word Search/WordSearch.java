
public class WordSearch {

	public static void main(String[] args) {

		char[][] board = {{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}};
		WordSearch hp = new WordSearch();
		String word = "ABCCED";
		System.out.println(hp.exist(board, word));
		
		
	}	
	 public boolean exist(char[][] board, String word) {
		  if (board == null || word == null || board.length == 0) {
	            return false;
	        }
	        int rowNum = board.length, colNum = board[0].length;
	        boolean[][] visited = new boolean[rowNum][colNum];
	        for (int i = 0; i < rowNum; i++) {
	            for (int j = 0; j < colNum; j++) {
	                if (exist(board, visited, i, j, word, 0)) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	 
	 private boolean exist(char[][] board, boolean[][] visited, int i, int j, String word, int pos) {
	        if (pos == word.length()) {
	            return true;
	        }
	        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1 || visited[i][j] || board[i][j] != word.charAt(pos)) {
	            return false;
	        }
	        visited[i][j] = true;
	        boolean res = exist(board, visited, i - 1, j, word, pos + 1)
	                   || exist(board, visited, i, j - 1, word, pos + 1)
	                   || exist(board, visited, i + 1, j, word, pos + 1)
	                   || exist(board, visited, i, j + 1, word, pos + 1);
	        
	        visited[i][j] = false;
	        return res;
	    }
}
