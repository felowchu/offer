package lintcode;

public class LC2 {
	public static void main(String[] args){
		long n = 2005;
		System.out.println(trailZeros(n));
	}
	
	public static long trailZeros(long n){
		
		long count = 0;
		
		//¼ÆËãnµÄ½×³Ë
		if(n == 0)     return 0;
		
		while(n != 0){
			n = n/5;
			count = count + n;
		}
		
		return count;
	}
}
