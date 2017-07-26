package bestchu;

public class Exhaustivity {
	public static void main(String[] args){
		for(int i=0;i<=35;i++){
				for(int j=0; j<=35; j++){
					if((2*i+4*j == 94) && (i + j == 35)){
						System.out.println("鸡有"+i+"只；兔有"+j+"只");
					}
				}
			}
		}
}
