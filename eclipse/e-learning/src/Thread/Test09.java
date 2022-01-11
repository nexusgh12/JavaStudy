package Thread;

public class Test09 {
	public static void main(String[] args) {
		PrintThread t = new PrintThread();
		
		t.start();
		
		t.interrupt();
	}
}
