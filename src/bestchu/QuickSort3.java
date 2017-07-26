package bestchu;

public class QuickSort3 {
	public static void main(String[] args){
		int[] a = {177,154,183,108,102,166,129,174,155,190,193,136,102,116,175,138,103,141};
		sort(a,0,a.length-1);
	}
	
	public static void sort(int a[], int low, int high){
		if(low < high){
			int key = a[low];
			int i = low;
			int j = high;
			while(i < j){
				while(a[i] < key && i < j){
					i++;
				}
				while(a[j] > key && i < j){
					j--;
				}
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				for(int k=0; k<a.length; k++){
					System.out.print(a[k]+" ");	
				}
				System.out.println();
				System.out.print(i+",");
				System.out.print(key+",");
				System.out.print(low+",");
				System.out.println();
				
				
			}
			
			sort(a, low, i-2);
			sort(a, j, high);
		}
	}
}
