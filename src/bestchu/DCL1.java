package bestchu;

public class DCL1 {
	private volatile static HeapSort sort;
	
	public static HeapSort getInstance(){
		if(sort == null){
			synchronized (DCL1.class) {
				if(sort == null){
					sort = new HeapSort();
				}
			}
		}
		return sort;
	} 
	
}
