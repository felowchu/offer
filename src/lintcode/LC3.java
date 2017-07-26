package lintcode;

public class LC3 {
	public static void main(String[] args){
		int k=0,n=4768;
		System.out.println(digitCounts(k,n));
	}
	
	public  static int digitCounts(int k,int n){
		int[] a = new int[n+1];
		int count = 0;
		for(int i = 0; i <= n; i++){
			a[i] = i;
			while(a[i] > 0){
				int m = a[i]%10;
				a[i] = a[i]/10;
				if(m == k){
					count++;
				}
			}
		}
		if(k == 0){
			count++;
		}
		return count;
	}
}
