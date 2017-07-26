package bestchu;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnsafeTask implements Runnable {
	private static ThreadLocal<Date> startDate = new ThreadLocal<Date>(){
		protected Date initialValue(){
			return new Date();
		}
	};
	@Override
	public void run() {
		System.out.println("Starting Thread:"+Thread.currentThread().getId()+":"+startDate.get());
		try {
			TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()*10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Starting Thread:"+Thread.currentThread().getId()+":"+startDate.get());
	}
	
	public static void main(String[] args){
		UnsafeTask task = new UnsafeTask();
		for(int i = 0; i < 10; i++){
			Thread t = new Thread(task);
			t.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (Exception e) {
			}
		}
	}
}
