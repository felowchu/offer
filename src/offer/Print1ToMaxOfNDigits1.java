package offer;
/*��ӡ1������Nλ��
 * ֻ����int��Χ�ڵ���
 * */
public class Print1ToMaxOfNDigits1 {
	public static void main(String[] args){
		printNumber(5);
	}
	
	public static void printNumber(int n){
		int max = (int) Math.pow(10, n);
		for(int i = 1; i < max; i++){
			System.out.println(i);
		}
	}
}
