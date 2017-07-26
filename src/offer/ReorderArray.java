package offer;
/*调整数组顺序，使奇数位于偶数之前*/
public class ReorderArray {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8};
		reOrder(a);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void reOrder(int[] array){
		if(array.length == 0)
			return;
		
		for(int i = 0; i < array.length; i++){
			int j = i;
			if((array[j] & 1) == 1){
				while(j > 0 && (array[j-1] & 1) == 0){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					j--;
				}
			}
		}
	}
}
