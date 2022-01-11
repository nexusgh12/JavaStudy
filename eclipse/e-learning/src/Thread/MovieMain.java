package Thread;

public class MovieMain {
public static void main(String[] args) {
	Thread t1 = new Thread(new Movie());
	Thread t2 = new Thread(new Think());
	
	t1.start();
	t2.start();
	for(int i = 1; i <= 1000; i++) {
		System.out.println("Àáµé±â : " + i);
	}
}
}
