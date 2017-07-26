package bestchu;

public class Merge {
	public static void main(String[] args){
		int[] a = {49,38,65,97,76,13,27,49,78,34,12,64};
		sort(a, 0, a.length-1);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void sort(int[] a, int low, int high){
		int[] aux = new int[a.length];
		int mid = (high - low)/2+low;
		if(high <= low) return;
		
		sort(a, low, mid);
		sort(a, mid+1, high);
		
		int temp1 = low;
		int temp2 = mid+1;
		
		for(int i=low; i<=high; i++){
			aux[i] = a[i];
		}
		
		for(int j=low; j<=high; j++){
			if(temp1 > mid)                  a[j] = aux[temp2++];
			else if(temp2 > high)            a[j] = aux[temp1++];
			else if(aux[temp2] > aux[temp1]) a[j] = aux[temp1++];
			else                             a[j] = aux[temp2++];
		}
	}
}
