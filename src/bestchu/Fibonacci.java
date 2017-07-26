package bestchu;

public class Fibonacci {
	public static void main(String[] args){
		int[] coin = {3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3} ;
		int low = 0;
		int high = 29;
		int l = algorithm(coin, low, high);
		System.out.println(l);
	}
	
	public static int algorithm(int[] coin, int low, int high){
		
		int sum1,sum2;
		sum1 = sum2 = 0;
		
		if(low+1 == high){
			if(coin[low] < coin[high]){
				return low+1;
			}else{
				return high+1;
			}
		}
		
		if((high-low+1)%2 == 0){                        //如果硬币有偶数个
			for(int i=low; i<(high-low+1)/2; i++){
				sum1 += coin[i];
			}
			for(int i=(high-low)/2; i<=high; i++){
				sum2 += coin[i];
			}
			if(sum1 < sum2){
				high = (high - low)/2;
				return algorithm(coin,low,high);
			}else{
				low = (high - low)/2 + 1;
				return algorithm(coin,low,high);
			}
		}
		
		else{                          //如果硬币有奇数个
			for(int i=low; i<low+(high-low)/2; i++){
				sum1 += coin[i];
			}
			for(int i=low+(high-low)/2+1; i<=high; i++){
				sum2 += coin[i];
			}
			if(sum1 < sum2){
				high = (high - low)/2-1;
				return algorithm(coin, low, high);
			}
			else if(sum1 > sum2){
				low = (high - low)/2+1;
				return algorithm(coin, low, high);
			}else{
				return low+(high - low)/2+1;
			}
		}
	}
}
