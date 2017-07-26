package huaweisoftmatch;

public class Edge {
	
	private int i,j,cost,bw;
	
	public Edge(int i, int j, int cost, int bw){
		this.i = i;             //边的起点
		this.j = j;             //边的终点
		this.bw = bw;           //带宽
		this.cost = cost;       //单位带宽费用
	}
	
	public int cost(){
		return cost;
	}
	
	public int bw(){
		return bw;
	}
	
	public int from(){
		return i;
	}
	
	public int to(){
		return j;
	}
}
