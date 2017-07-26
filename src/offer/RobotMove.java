package offer;

public class RobotMove {
	public int movingCount(int threshold, int rows, int cols){
		boolean[] visited = new boolean[cols * rows];
		for(int i = 0; i < cols * rows; i++)
			visited[i] = false;
		int count = movingCountCore(threshold, rows, cols, 0, 0, visited);
		return count;
	}
	
	public int sum(int num){
		int sum = 0;
		while(num > 0){
			sum += num%10;
			num /= 10;
		}
		return sum;
	} 
	
	public int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] visited){
		int count = 0;
		if(row >=0 && row < rows && col >= 0 && col < cols && sum(row) + sum(col) <= threshold && !visited[row*cols+col]){
			visited[row*cols+col] = true;
			count = 1 + movingCountCore(threshold, rows, cols, row-1, col, visited)
						+ movingCountCore(threshold, rows, cols, row, col-1, visited)
						+ movingCountCore(threshold, rows, cols, row+1, col, visited)
						+ movingCountCore(threshold, rows, cols, row, col+1, visited);
		}
		return count;
	}
}
