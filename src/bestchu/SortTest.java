package bestchu;

public class SortTest {
	public static void main(String[] args){
		System.out.println("ֱ������");
		int[] a = {5,4,3,2,1};
		SortMethod1(a);
		System.out.println("ð������");
		int[] b = {5,4,3,2,1};
		SortMethod2(b);
	}
	
	public static void SortMethod1(int[] s){   //ֱ������,ÿ�ν���С�ķ��õ���ǰ��
		for(int i=0;i<s.length-1;i++){
			for(int j=i+1;j<s.length;j++){
				if(s[i]>s[j]){
					int temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
				for(int k=0;k<s.length;k++){
					System.out.print(s[k]+",");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static void SortMethod2(int[] s){    //ð�����򷨣�ÿ�ν����ķ��õ������
		for(int i=0;i<s.length-1;i++){
			for(int j=0;j<s.length-i-1;j++){
				if(s[j]>s[j+1]){
					int temp =s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
				for(int k=0;k<s.length;k++){
					System.out.print(s[k]+",");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static int halfsearch(int[] s, int key){
		int min,max,mid;
		min = 0;
		max = s.length-1;
		mid = (min+max)/2;
		while(s[mid]!=key){
			if(s[mid]>key){
				min = mid+1;
			}else{
				max = mid-1;
			}
			if(min>max){
				return -1;
			}
			mid = (min+max)/2;
		}
		return mid;
	}
}
