package offer;

import java.util.ArrayList;

public class PrintMatrixInCircle {
	public ArrayList<Integer> printMatrix(int[][] matrix){
		int rows = matrix.length;
		int columns = matrix[0].length;
		if(rows == 0 || columns == 0)
			return null;;
		int start = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (start*2 < rows && start*2 < columns) {
			circlePrint(matrix, rows, columns, start,al);
			start++;
		}
		return al;
	}
	
	public static void circlePrint(int[][] matrix, int rows, int columns,int start,ArrayList<Integer> al){
			for(int i = start; i <= columns - start - 1; i++){
				al.add(matrix[start][i]);
			}
		if(rows - 2*start > 1){
			for(int i = start + 1; i <= rows - start - 1; i++){
				al.add(matrix[i][columns-start-1]);
			}
		}
		if(rows - 2*start > 1 && columns - 2*start > 1){
			for(int i = columns - start - 2; i >= start; i--){
				al.add(matrix[rows-start-1][i]);
			}
		}
		if(rows - 2*start > 2 && columns - 2*start >1){
			for(int i = rows - start - 2; i >= start+1; i--){
				al.add(matrix[i][start]);
			}
		}
	}
}
