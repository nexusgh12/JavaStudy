package Thread;

public class WorkMain {
	public static void main(String[] args) {
		Work1 t1 = new Work1();
		Work2 t2 = new Work2();
		
		t1.start();
		t2.start();
		
	}
}
