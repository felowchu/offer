package bestchu;

public class QiuckSort2 {
	public static void main(String[] args){
		int[] a = {177,154,183,108,102,166,129,174,155,190,193,136,102,116,175,138,103,141};
		int[] index = new int[a.length];
		for(int i = 0; i < index.length; i++){
			index[i] = i;
		}
		sort(a,index,0,a.length-1);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i = 0; i < index.length; i++){
			System.out.print(index[i]+"   ");
		}
	}
	
	public static void sort(int[] a, int[] index, int low, int high){
		if(low < high){
			int i = low;
			int key1 = a[low];
			int key2 = index[low];
			int j;
			for(j=low+1; j<=high; j++){
				if(a[j] > key1){
					int temp1 = a[j];
					a[j] = a[i+1];
					a[i+1] = temp1;
					int temp2 = index[j];
					index[j] = index[i+1];
					index[i+1] = temp2;
					
					i++;	
				}
			}
			a[low] = a[i];
			a[i] = key1;
			index[low] = index[i];
			index[i] = key2;
			sort(a, index, low, i-1);
			sort(a, index, i+1, high);
		}
	}
}
