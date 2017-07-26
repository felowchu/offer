package offer;

public class JumpFloor {
	public int jumpFloor(int target){
		int num1 = 1;
		int num2 = 2;
		while(target-- > 1){
			num2 += num1;
			num1 = num2 - num1;
		}
		return num1;
	}
}
