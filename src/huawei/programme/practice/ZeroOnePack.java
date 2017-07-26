package huawei.programme.practice;
//从下到上的0—1背包问题
public class ZeroOnePack {
	private final int CAPACITY = 10;                      //背包容积
	private final int[] weight = {2,2,6,5,4};             //每个物品重量
	private final int[] value = {6,3,5,4,6};              //每个物品价值
	private final int COUNT = value.length;               //物品总数
	private int[][] maxValue = new int[COUNT + 1][CAPACITY + 1];
	public int[] result = new int[COUNT];                 //物品选择的结果
	
	public void solve(){
		for(int i = COUNT - 1; i >= 0; i--){
			for(int w = 0; w <= CAPACITY; w++){
				if(w < weight[i])
					maxValue[i][w] = maxValue[i+1][w];
				else
					maxValue[i][w] = Math.max(maxValue[i+1][w], maxValue[i+1][w - weight[i]] + value[i]);
			}
		}
	}
	
	public void answer(){
		int w = CAPACITY;
		for(int i = 0; i < COUNT; i++){
			if(maxValue[i][w] == maxValue[i+1][w])
				result[i] = 0;
			else{
				result[i] = 1;
				w -= weight[i];
			}
		}
	}
	
	public static void main(String[] arga){
		ZeroOnePack zop = new ZeroOnePack();
		zop.solve();
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 11; j++)
				System.out.printf("%4d",zop.maxValue[i][j]);
			System.out.println();
		}
		zop.answer();
		System.out.print("应该选择带的物品为：");
		for(int i = 0; i < 5; i++){
			System.out.print(zop.result[i]+" ");
		}
		System.out.println("最大价值为： "+zop.maxValue[0][10]);
	}
}
