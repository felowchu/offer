package bestchu;
//从上到下的0-1背包问题
public class ZeroOnePack {
	public static int[][] maxValue = new int[6][11];
	public static int[] value = {0,6,3,5,4,6};
	public static int[] weight = {0,2,2,6,5,4};
	public static int COUNT = 6;
	public final static int CAPACITY = 10;
	public static void main(String[] args){
		solve();
		int[] x = new int[COUNT];
		answer(x);
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 11; j++){
				System.out.printf("%4d",maxValue[i][j]);
			}
			System.out.println();
		}
		for(int i = 1; i < 6; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println("最大价值为:" + maxValue[5][10]);
	}
	
	public static void solve(){
		int num = value.length - 1;
		for(int i = 1; i <= num; i++){
			for(int w = 0; w <= CAPACITY; w++){
				if(weight[i] <= w)
					maxValue[i][w] = Math.max(maxValue[i - 1][w], maxValue[i - 1][w - weight[i]] + value[i]);
				else
					maxValue[i][w] = maxValue[i - 1][w];
			}
		}
	}
	
	public static void answer(int[] x){
		int n = maxValue.length - 1;
		int w = maxValue[0].length - 1;
		for(int i = n; i >= 1; i--){
			if(maxValue[i][w] == maxValue[i - 1][w])
				x[i] = 0;
			else{
				w = w - weight[i];
				x[i] = 1;
			}
		}
	}
}
