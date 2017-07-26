package bestchu;

import java.util.Arrays;
import java.util.Date;

public class StringDemo1 {
	public static void main(String[] args){
		String s1 = "abcdefghij";
		
		//输出指定位置的字符
		char c1 = s1.charAt(3);
		System.out.println(c1);
		
		//对String进行格式化
		Date d1 = new Date();
		System.out.println(d1);
		
		//判断字符串是否为空
		boolean f = s1.isEmpty();
		System.out.println(f);
		
		//将string编码到byte序列
		byte[] b = s1.getBytes();
		System.out.println(Arrays.toString(b));
		
		//按字典顺序比较两个字符串
		String s2 = "abcdefghij";
		int c = s1.compareTo(s2);
		System.out.println(c);
		
		//比较两个字符串对象的内容
		boolean e = s1.equals(s2);
		System.out.println(e);
		System.out.println(s1==s2);
		String s3 = new String("abcdefghij");
		boolean h = s1.equals(s3);
		System.out.println(h);
		System.out.println(s1==s3);
		
		//返回字符串中第一次出现str的位置
		int i = s1.indexOf("def");
		System.out.println(i);
		
		//忽略大小写比较两个字符串是否相同
		String s4 = "ABcdefghij";
		boolean j = s1.equalsIgnoreCase(s4);
		System.out.println(j);
		
		//寻找从指定位置开始第一次出现的字符串
		String s5 = "abcabcabcabcabcabc";
		int m = s5.indexOf("abc", 5);
		System.out.println(m);
		
		//用新字符串替换就字符串
		String s6 = s5.replace("abc","def");
		System.out.println(s5);
		System.out.println(s6);
		
		//判断字符串是否以str开头
		boolean n = s6.startsWith("def");
		boolean o = s6.endsWith("def");
		System.out.println(n+","+o);
		
		//返回一个字符串的大写形式和小写形式
		String s7 = s4.toLowerCase();
		String s8 = s4.toUpperCase();
		System.out.println(s7+","+s8);
		
		//放回子字符串
		String s9 = s7.substring(3, 7);
		String s10 = s7.substring(3);
		System.out.println(s9+","+s10);
		
		//去掉字符串的头和尾
		String s11 = "  akhdajs  akas  ";
		String s12 = s11.trim();
		System.out.println(s12);
		
		//将字符串按照指定的分隔符分割
		String[] s13 = s5.split("c");
		System.out.println(Arrays.toString(s13));
		for(int p=0;p<s13.length;p++){
			System.out.println(s13[i]+",");
		}
	}
}
