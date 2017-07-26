package bestchu;

public class StringDemo {
	public static void main(String[] args){
		char[] helloArray = {'h','e','l','l','o','.'};
		String helloString = new String(helloArray);
		//字符数组转字符串
		System.out.println(helloString);
		//计算字符数组的长度
		System.out.println("字符数组的长度："+helloArray.length);
		//计算字符串的长度
		System.out.println("字符串的长度："+helloString.length());
		
		//拼接两个字符串
		String s1 = "我的名字叫：";
		String s2 = "储洪波";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		//substring包含头不包含尾
		System.out.println(s1.substring(1, 2));
		int b = s1.codePointAt(3);
		int a = s1.codePointCount(1,3);
		System.out.println(a+","+b);
	}
}
