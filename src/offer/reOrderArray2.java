package offer;
/*调整数组中的元素，事所有奇数位于偶数之前，
 * 并且奇数和奇数之间，偶数和偶数之间的相对位置不发生变化*/
public class reOrderArray2 {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8};
		reOrder(a);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void reOrder(int[] array){
		if(array.length == 0){
			return;
		}
		
		int odd = 0;
		while (odd < array.length) {
			
		}
	}
}
