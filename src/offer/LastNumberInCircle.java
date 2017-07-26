package offer;

public class LastNumberInCircle {
	public int lastRemain(int n, int m){
		if(n < 1 || m < 1)
			return -1;
		int last = 0;
		for(int i = 2; i < n; i++){
			last = (last + m) % i;
		}
		return last;
	}
}
