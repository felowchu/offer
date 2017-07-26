package offer;

public class StringToInt {
	public int StrToInt(String str){
		Long num = 0L;
		boolean minus = false;
		if(str.length() != 0){
			if(str.charAt(0) == '+')
				str = str.substring(1, str.length());
			else if(str.charAt(0) == '-'){
				str = str.substring(1, str.length());
				minus = true;
			}
			if(str != null)
				num = StrToIntCore(str, minus);
		}
        int result = Integer.valueOf(String.valueOf(num));
		return result;
	}
	public Long StrToIntCore(String str, boolean minus){
		Long num = 0L;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) > '0' && str.charAt(i) < '9'){
				int flag = minus ? -1 : 1;
				num = num*10 + flag * str.charAt(i) - '0';
				if(num > Integer.MAX_VALUE && num < Integer.MIN_VALUE){
					num = 0L;
					break;
				}
			}else{
				num = 0L;
				break;
			}
		}
		return num;
	}
}
