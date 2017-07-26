package bestchu;

public class Demo7 {
	public static void main(String[] args){
		System.out.println(Demo7.test());
	}
	public static int test(){
		int x = 0;
		try{
			x = 1;
			return x;
		}catch(Exception e){
			x = 2;
			return x;
		}finally{
			x = 3;
		}
	}
}
