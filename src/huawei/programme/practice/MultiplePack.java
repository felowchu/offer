package huawei.programme.practice;

public class MultiplePack {
	private final int CAPACITY = 8;
	private final int[] weight = {1,2,2};
	private final int[] value = {6,10,20};
	private final int[] count = {10,5,2};
	private final int NUM = 3;
	private int[] maxValue = new int[CAPACITY + 1];
	
	public void zeroOnePack(int w, int v){
		for(int i = CAPACITY; i >= w; i--){
			maxValue[i] = Math.max(maxValue[i], maxValue[i - w] + v);
			System.out.print(maxValue[i] + " ");
		}
	}
	
	public void CompletePack(int w, int v){
		for(int i = w; i <= CAPACITY; i++){
			maxValue[i] = Math.max(maxValue[i], maxValue[i - w] + v);
			System.out.print(maxValue[i] + " ");
		}
	}
	
	public void mutiplePack(){
		for(int i = NUM -1; i >= 0; i--){
			int w = weight[i];
			if(w * count[i] >= CAPACITY)
				CompletePack(w, value[i]);
			else{
				int k = 1;
				int n = count[i];
				while(k <= n){
					zeroOnePack(k * w, k * value[i]);
					n -= k;
					k *= 2;
				}
				zeroOnePack(n * w, n * value[i]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		MultiplePack mp = new MultiplePack();
		mp.mutiplePack();
		System.out.println("可携带物品的最大价值为： " + mp.maxValue[mp.CAPACITY]);
	}
}
