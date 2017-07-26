package bestchu;

public class QuickSort {
	public static void main(String[] args){
		int[] a = {177,154,183,108,102,166,129,174,155,190,193,136,102,116,175,138,103,141};
		sort(a,0,a.length-1);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}

	}
	
	 private static void sort(int[] array,int start,int end) 
	   { 
	       if(start<end) 
	       { 
	           int key=array[start];//��ʼ�������Ԫ  
	           int i=start,j;//��ʼ��i,j  
	           for(j=start+1;j<=end;j++){ 
	             
	               if(array[j]<key)//����˴�Ԫ��С�ڻ�Ԫ����Ѵ�Ԫ�غ�i+1��Ԫ�ؽ���������i��1������ڻ���ڻ�Ԫ�����ѭ��  
	               { 
	                   int temp=array[j]; 
	                   array[j]=array[i+1]; 
	                   array[i+1]=temp; 
	                   i++; 
	               } 
	                 
	           } 
	           array[start]=array[i];//����i��Ԫ�غͻ�Ԫ  
	           array[i]=key; 
	           sort(array, start, i-1);//�ݹ����  
	           sort(array, i+1, end); 
	             
	       } 
		}      
}
