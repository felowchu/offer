package offer;

/*����ĳ���������Ʊ�ʾ��1�ĸ���
*������λ������
*/
public class NumberOf1InBinary1 {
	public static void main(String[] args){
		System.out.println(numberOf1(125));
	}
	public static int numberOf1(int n){
		int count = 0;
		while(n > 0){
			if((n&1) == 1){
				count++;
			}
			n = n >> 1;
		}
		return count;
	}
}
