package offer;
/*打印1到最大的N位数，使用数组处理大数情况*/
public class Print1ToMaxOfNDigits2 {
	public static void main(String[] args){
		printNumber(5);
	}
	
	public static void printNumber(int n){
		if(n <= 0)
			return;
		
		int[] number = new int[n];
		for(int i=0; i < n;i++){
			number[i] = 0;
		}
		while(!increment(number)){
			printNumber(number);
		}
	}
	
	public static boolean increment(int[] number){
		boolean overflow = false;
		int carry = 0;
		int len = number.length;
		for(int i = len-1; i >=0; i--){
			int sum = number[i] + carry;
			if(i == len -1)
				sum++;
			if(sum >= 10){
				if(i == 0)
					overflow = true;
				else{
					sum -= 10;
					carry = 1;
					number[i] = sum;
				}
			}else{ 
				number[i] = sum;
				break;
			}
		}
		return overflow;
	}
	
	public static void printNumber(int[] number){
		boolean isBegin0 = true;
		for(int i = 0; i < number.length; i++){
			if(isBegin0 && number[i] != 0){
				isBegin0 = false;
			}
			if(!isBegin0)
				System.out.print(number[i]);
		}
		System.out.println();
	}
}
