package bestchu;

public class StringDemo {
	public static void main(String[] args){
		char[] helloArray = {'h','e','l','l','o','.'};
		String helloString = new String(helloArray);
		//�ַ�����ת�ַ���
		System.out.println(helloString);
		//�����ַ�����ĳ���
		System.out.println("�ַ�����ĳ��ȣ�"+helloArray.length);
		//�����ַ����ĳ���
		System.out.println("�ַ����ĳ��ȣ�"+helloString.length());
		
		//ƴ�������ַ���
		String s1 = "�ҵ����ֽУ�";
		String s2 = "���鲨";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		//substring����ͷ������β
		System.out.println(s1.substring(1, 2));
		int b = s1.codePointAt(3);
		int a = s1.codePointCount(1,3);
		System.out.println(a+","+b);
	}
}
