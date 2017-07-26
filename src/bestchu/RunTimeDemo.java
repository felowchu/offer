package bestchu;

public class RunTimeDemo {
	public static void main(String[] args) throws Exception{
		Runtime run = Runtime.getRuntime();
		Process p = run.exec("F:\\write.exe");
		Thread.sleep(400);
		p.destroy();
	}
}
