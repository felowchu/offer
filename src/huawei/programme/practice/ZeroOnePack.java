package huawei.programme.practice;
//���µ��ϵ�0��1��������
public class ZeroOnePack {
	private final int CAPACITY = 10;                      //�����ݻ�
	private final int[] weight = {2,2,6,5,4};             //ÿ����Ʒ����
	private final int[] value = {6,3,5,4,6};              //ÿ����Ʒ��ֵ
	private final int COUNT = value.length;               //��Ʒ����
	private int[][] maxValue = new int[COUNT + 1][CAPACITY + 1];
	public int[] result = new int[COUNT];                 //��Ʒѡ��Ľ��
	
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
		System.out.print("Ӧ��ѡ�������ƷΪ��");
		for(int i = 0; i < 5; i++){
			System.out.print(zop.result[i]+" ");
		}
		System.out.println("����ֵΪ�� "+zop.maxValue[0][10]);
	}
}
