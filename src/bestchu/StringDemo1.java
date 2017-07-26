package bestchu;

import java.util.Arrays;
import java.util.Date;

public class StringDemo1 {
	public static void main(String[] args){
		String s1 = "abcdefghij";
		
		//���ָ��λ�õ��ַ�
		char c1 = s1.charAt(3);
		System.out.println(c1);
		
		//��String���и�ʽ��
		Date d1 = new Date();
		System.out.println(d1);
		
		//�ж��ַ����Ƿ�Ϊ��
		boolean f = s1.isEmpty();
		System.out.println(f);
		
		//��string���뵽byte����
		byte[] b = s1.getBytes();
		System.out.println(Arrays.toString(b));
		
		//���ֵ�˳��Ƚ������ַ���
		String s2 = "abcdefghij";
		int c = s1.compareTo(s2);
		System.out.println(c);
		
		//�Ƚ������ַ������������
		boolean e = s1.equals(s2);
		System.out.println(e);
		System.out.println(s1==s2);
		String s3 = new String("abcdefghij");
		boolean h = s1.equals(s3);
		System.out.println(h);
		System.out.println(s1==s3);
		
		//�����ַ����е�һ�γ���str��λ��
		int i = s1.indexOf("def");
		System.out.println(i);
		
		//���Դ�Сд�Ƚ������ַ����Ƿ���ͬ
		String s4 = "ABcdefghij";
		boolean j = s1.equalsIgnoreCase(s4);
		System.out.println(j);
		
		//Ѱ�Ҵ�ָ��λ�ÿ�ʼ��һ�γ��ֵ��ַ���
		String s5 = "abcabcabcabcabcabc";
		int m = s5.indexOf("abc", 5);
		System.out.println(m);
		
		//�����ַ����滻���ַ���
		String s6 = s5.replace("abc","def");
		System.out.println(s5);
		System.out.println(s6);
		
		//�ж��ַ����Ƿ���str��ͷ
		boolean n = s6.startsWith("def");
		boolean o = s6.endsWith("def");
		System.out.println(n+","+o);
		
		//����һ���ַ����Ĵ�д��ʽ��Сд��ʽ
		String s7 = s4.toLowerCase();
		String s8 = s4.toUpperCase();
		System.out.println(s7+","+s8);
		
		//�Ż����ַ���
		String s9 = s7.substring(3, 7);
		String s10 = s7.substring(3);
		System.out.println(s9+","+s10);
		
		//ȥ���ַ�����ͷ��β
		String s11 = "  akhdajs  akas  ";
		String s12 = s11.trim();
		System.out.println(s12);
		
		//���ַ�������ָ���ķָ����ָ�
		String[] s13 = s5.split("c");
		System.out.println(Arrays.toString(s13));
		for(int p=0;p<s13.length;p++){
			System.out.println(s13[i]+",");
		}
	}
}
