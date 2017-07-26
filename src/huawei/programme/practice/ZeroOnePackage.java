package huawei.programme.practice;
//空间优化的0-1背包算法，从下往上，从左到右
public class ZeroOnePackage {
	private final int CAPACITY = 10;     //背包容量
	private final int[] value = {6,3,5,4,6};   //每件物品的价值
	private final int[] weight = {2,2,6,5,4};  //每件物品的重量
	private final int COUNT = value.length;    //物品数量
	private int[] maxValue = new int[CAPACITY + 1];
	public int[] result = new int[COUNT];
	
	public void solve(){
		for(int i = COUNT - 1; i >= 0; i--){
			for(int w = CAPACITY; w > 0 ; w--){
				if(w >= weight[i])
					maxValue[w] = Math.max(maxValue[w], maxValue[w - weight[i] ] + value[i]);
				System.out.printf("%4d",maxValue[w]);
			}
			System.out.println();
		}
	}
	public void answer(){
		
	}
	
	public static void main(String[] args){
		ZeroOnePackage zop = new ZeroOnePackage();
		zop.solve();
	}
}
