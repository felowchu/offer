package offer;

public class NumericString {
	public int index = 0;
	
	public static void main(String[] args){
		char[] num = {'1','2','3','.','E','5'};
		NumericString ns = new NumericString();
		System.out.println(ns.isNumeric(num));
	}
	
	public boolean isNumeric(char[] str){
		if(str.length == 0)
			return false;
		boolean numeric = isInteger(str);
		
		if(index < str.length && str[index] == '.'){
			index++;
			numeric = isUnsignedInteger(str) || numeric;
		}
		
		if(index < str.length && (str[index] == 'e' || str[index] =='E')){
			index++;
			numeric &= isInteger(str);
		}
		
		return numeric && index == str.length;
	}
	
	public boolean isInteger(char[] str){
		if(str[index] == '+' || str[index] == '-')
			index++;
		return isUnsignedInteger(str);
	}
	
	public boolean isUnsignedInteger(char[] str){
		int before = index;
		while(index < str.length && (str[index] >= '0' && str[index] <= '9'))
			index++;
		return index > before;
	}
}
