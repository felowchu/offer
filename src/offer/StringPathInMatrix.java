package offer;

public class StringPathInMatrix {
	int pathLen = 0;
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
		if(matrix.length == 0 || rows < 1 || cols < 1 || str.length == 0)
			return false;
		boolean[] visited = new boolean[rows * cols];
		for(int i = 0; i < rows * cols; i++){
			visited[i] = false;
		}
		
		for(int row = 0; row < rows; row++){
			for(int col = 0; col < cols; col++){
				if(hasPathCore(matrix, rows, cols, str, row, col, visited))
					return true;
			}
		}
		return false;
	}
	
	public boolean hasPathCore(char[] matrix, int rows, int cols, char[] str, int row, int col, boolean[] visited){
		if(pathLen == str.length)
			return true;
		boolean hasPath = false;
		if(row >= 0 && row < rows && col >= 0 && col < cols && matrix[row * cols + col] == str[pathLen] && visited[row*cols+col] == false){
			pathLen++;
			visited[row*cols+col] = true;
			hasPath = hasPathCore(matrix, rows, cols, str, row-1, col, visited) 
					  || hasPathCore(matrix, rows, cols, str, row, col-1, visited)
			          || hasPathCore(matrix, rows, cols, str, row+1, col, visited)
			          || hasPathCore(matrix, rows, cols, str, row, col+1, visited);
			if(!hasPath){
				pathLen--;
				visited[row*cols+col] = false;
			}
		}
		return hasPath;
	}
}
