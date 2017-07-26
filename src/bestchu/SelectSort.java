package bestchu;

public class SelectSort {
	public static void main(String[] args){
		int[] a = {2,3,4,1,21,34,21,45,32,11,65,33};
		sort(a);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+", ");
		}
	}
	
	public static void sort(int[] a){
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					int temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				}
			}
		}
	}
}
