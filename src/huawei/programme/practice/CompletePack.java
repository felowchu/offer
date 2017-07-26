package huawei.programme.practice;

public class CompletePack {
	private final int TOTAL = 10;
	private final int[] len = {3,2,5,1,6,4};
	private final int[] cost = {6,5,10,2,16,8};
	private final int COUNT = 6;
	public int[] minCost = new int[TOTAL + 1];
	
	public void solve(){
		for(int i = COUNT - 1; i >= 0; i--){
			for(int c = len[i]; c <= TOTAL; c++){
				minCost[c] = Math.max(minCost[c], minCost[c - len[i]] + cost[i]);
				System.out.print(minCost[c] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		CompletePack cp = new CompletePack();
		cp.solve();
	}
}
