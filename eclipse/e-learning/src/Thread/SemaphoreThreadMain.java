package Thread;

import java.util.concurrent.Semaphore;

public class SemaphoreThreadMain {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);
		
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		
	}
}
