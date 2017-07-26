package huaweisoftmatch;

public class Edge {
	
	private int i,j,cost,bw;
	
	public Edge(int i, int j, int cost, int bw){
		this.i = i;             //�ߵ����
		this.j = j;             //�ߵ��յ�
		this.bw = bw;           //����
		this.cost = cost;       //��λ�������
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
