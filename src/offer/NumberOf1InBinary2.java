package offer;
/*����ĳ��������������1�ĸ�����
 * �ɼ��㸺�����������ѭ������Ϊ32*/
public class NumberOf1InBinary2 {
	public static void main(String[] args){
		System.out.println(numberOf1(-56));
	}
	public static int numberOf1(int n){
		int count = 0;
		int flag = 1;
		while(flag > 0){
			if((n&flag) > 0){
				count++;
			}
			flag = flag << 1;
		}
		return count;
	}
}
