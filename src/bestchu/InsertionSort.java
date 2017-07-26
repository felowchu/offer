package bestchu;

public class InsertionSort {
	public static void main(String[] args){
		int[] a = {2,3,4,1,21,34,21,45,32,11,65,33};
		sort(a);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+", ");
		}
	}
	
	public static void sort(int[] a){
		for(int i=1; i<a.length; i++){
			int t = a[i];
			int j = i-1;
			while(j>=0 && t < a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
}
