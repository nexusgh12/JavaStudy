package Thread;

import java.util.concurrent.Semaphore;

public class SemaphoreThread extends Thread{
	private Semaphore semaphore;
	
	public SemaphoreThread(Semaphore semaphore) {
		// TODO Auto-generated constructor stub
		this.semaphore = semaphore;
	}
	
	public void run() {
		try {
			this.semaphore.acquire();
			System.out.println(getName());
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			this.semaphore.release();
		}
	}
}
