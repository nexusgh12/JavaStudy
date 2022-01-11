package Thread;

public class Movie implements Runnable{
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("영화보기 : " + i);
		}
	}
}

class Think implements Runnable{
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("멍때리기 : " + i);
		}
	}
}