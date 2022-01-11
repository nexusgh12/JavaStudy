package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		
		threadPool.execute(new Movie());
		threadPool.execute(new Think());
		
		threadPool.shutdown();
	}
}
