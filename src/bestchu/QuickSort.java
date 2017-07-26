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
	           int key=array[start];//初始化保存基元  
	           int i=start,j;//初始化i,j  
	           for(j=start+1;j<=end;j++){ 
	             
	               if(array[j]<key)//如果此处元素小于基元，则把此元素和i+1处元素交换，并将i加1，如大于或等于基元则继续循环  
	               { 
	                   int temp=array[j]; 
	                   array[j]=array[i+1]; 
	                   array[i+1]=temp; 
	                   i++; 
	               } 
	                 
	           } 
	           array[start]=array[i];//交换i处元素和基元  
	           array[i]=key; 
	           sort(array, start, i-1);//递归调用  
	           sort(array, i+1, end); 
	             
	       } 
		}      
}
