package Thread;

public class Movie implements Runnable{
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("��ȭ���� : " + i);
		}
	}
}

class Think implements Runnable{
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("�۶����� : " + i);
		}
	}
}