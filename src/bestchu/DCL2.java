package bestchu;

public class DCL2 {
	private static class Instance{
		public static HeapSort sort = new HeapSort();
	}
	
	public static HeapSort getInstance(){
		return Instance.sort;
	} 
}
