package offer;

public class NumberOf1Between1AndN2 {
	public static void main(String[] args){
		System.out.println(numberOf1(1512));
	}
	public static int numberOf1(int n){
		int count = 0;
		for(int i = 1; i <=n; i++){
			int temp = i;
			while(temp > 0){
				if(temp%10 == 1){
					count++;
				}
				temp /= 10;
			}
		}
		return count;
	}
}
