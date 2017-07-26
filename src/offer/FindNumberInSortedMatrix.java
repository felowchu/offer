package offer;

public class FindNumberInSortedMatrix {
	public boolean find(int target, int[][] array){
		int rows = array.length;
		int cols = array[0].length;
		int row = 0;
		int col = cols - 1;
		while(row < rows && col >= 0){
			if(array[row][col] < target)
				row++;
			else if(array[row][col] > target)
				col--;
			else 
				return true;
		}
		return false;
	}
}
