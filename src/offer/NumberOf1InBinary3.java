package offer;
/*����ĳ�����������Ʊ�ʾ��1�ĸ���
 * ���Լ��㸺�������������ѭ��������������1�ĸ�����ͬ
 * */
public class NumberOf1InBinary3 {
	public static void main(String[] args){
		System.out.println(numberOf1(25));
	}
	public static int numberOf1(int n){
		int count = 0;
		while(n != 0){
			count++;
			n = n & (n-1);
		}
		return count;
	}
}
