package huawei.programme.practice;
//�ռ��Ż���0-1�����㷨���������ϣ�������
public class ZeroOnePackage {
	private final int CAPACITY = 10;     //��������
	private final int[] value = {6,3,5,4,6};   //ÿ����Ʒ�ļ�ֵ
	private final int[] weight = {2,2,6,5,4};  //ÿ����Ʒ������
	private final int COUNT = value.length;    //��Ʒ����
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
