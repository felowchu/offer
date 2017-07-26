package offer;

public class RingShiftLeft {
	public String LeftRotateString(String str, int n){
		return str.substring(n, str.length())+str.substring(0,n);
	}
}
