package bestchu;

public class HeapSort {
	public static void main(String[] args){
		int[] a = {34,23,16,87,45,29,30,67,12,45};
		heapSort(a);
		for(int i = 0; i< a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static int[] buildHeap(int[] a){
		for(int i = (a.length-2)/2; i >= 0; i--){
			sink(a,i,a.length);
		}
		return a;
	}
	
	public static void sink(int[] a ,int k, int length){
		int temp = a[k];
		for(int i = 2*k+1; i < length-1; i = 2*i+1){
			if(i < length && a[i] < a[i+1]){
				i++;
			}
			if(temp >= a[i]){
				break;
			}else{
				a[k] = a[i];
				k = i;
		    }
		}
		a[k] = temp;
	}
	
	public static int[] heapSort(int[] a){
		a = buildHeap(a);
		for(int i = a.length-1; i > 1; i--){
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			sink(a, 0, i);
		}
		return a;
	}
}
