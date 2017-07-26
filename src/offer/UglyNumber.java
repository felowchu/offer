package offer;
/*暴力算法计算第n个丑数*/
public class UglyNumber {
	public static void main(String[] args){
		System.out.println(GetUglyNumber(1569));
	}
	public static int GetUglyNumber(int index){
		if(index <= 0)
			return 0;
		int i = 1;
		while(index > 0){
			if(isUglyNumber(i)){
				index--;
			}
			i = i+1;
		}
		return i-1;
	}
	public static boolean isUglyNumber(int i){
		boolean isUgly = true;
		while(i > 1 && isUgly == true){
			if(i%2 == 0)
				i = i/2;
			else if(i%5 == 0)
				i = i/5;
			else if(i%3 == 0)
				i = i/3;
			else
				isUgly = false;
		}
		if(i == 1 && isUgly == true)
			return true;
		return isUgly;
	}
}
