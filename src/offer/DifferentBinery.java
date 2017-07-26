package offer;

public class DifferentBinery {
	public static void main(String[] args){
		int a = 1999;
		int b = 2999;
		
		System.out.println(countBitDiff(a, b));
	}
	
	public static int countBitDiff(int m, int n){
		
		int count = 0;
		int a = m^n;
        Integer b = Integer.valueOf(a);
        String s = Integer.toBinaryString(b);
        for(int i =0; i<s.length();i++){
        	if(s.charAt(i) == '1'){
        		count++;
        	}
        }
        
        return count;
	}
}
