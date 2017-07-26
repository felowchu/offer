package bestchu;

public class Merge2 {
	private static int[] aux;
	
	public static void main(String[] args){
		int[] a = {49,38,65,97,76,13,27,49,78,34,12,64};
		sort(a);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void sort(int[] a){
		
		aux = new int[a.length];
		sort(a, 0, a.length-1);
	}
	
	private static void sort(int[] a, int low, int high){
		if(high <= low) return;
		int mid = low +(high - low)/2;
		
		sort(a, low, mid);
		sort(a, mid+1, high);
		merge(a, low, mid, high);
	}
	
	public static void merge(int[] a, int low, int mid, int high){
		int i = low, j = mid + 1;
		for(int k = low; k <= high; k++){
			aux[k] = a[k];
		}
		for(int k = low; k <= high; k++){
			if(i > mid)                 a[k] = aux[j++];
			else if(j > high)           a[k] = aux[i++];
			else if(aux[j] < aux[i])    a[k] = aux[j++];
			else                        a[k] = aux[i++];
		}
	}
}

