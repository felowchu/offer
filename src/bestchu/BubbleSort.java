package bestchu;

public class BubbleSort {
	public static void main(String[] args){
		int[] a = {2,3,4,1,21,34,21,45,32,11,65,33};
		sort(a);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+", ");
		}
	}
	
	public static void sort(int[] a){
		for(int i=1; i<a.length; i++){
			for(int j=0; j<a.length-i; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
