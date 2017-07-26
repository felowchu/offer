package bestchu;

public class MenteCarlo {
	public static void main(String[] args){
		double pi = MentePI();
		System.out.println(pi);
	}
	
	public static double MentePI(){
		int count = 0;
		for(int i=0; i<5000000; i++){
			double x = Math.random();
			double y = Math.random();
			if(x*x+y*y <= 1){
				count++;
			}
		}
		return 4.0*count/5000000;
	}
}
