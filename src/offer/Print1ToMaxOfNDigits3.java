package offer;
/*打印1到最大的N位数，使用数组+递归处理大数情况*/
public class Print1ToMaxOfNDigits3 {
	public static void main(String[] args){
		printNumber(5);
	}
	
	public static void printNumber(int n){
		if(n < 0)
			return;
		
		int[] number = new int[n];
		for(int i = 0; i < 10; i++){
			print1ToN(number,0);
		}
	}
	
	public static void print1ToN(int[] number,int index){
		if(index == number.length-1){
			printNumber(number);
			return;
		}
		
		for(int i = 0; i < 10; i++){
			number[index+1] = i;
			print1ToN(number, index+1);
		}
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
