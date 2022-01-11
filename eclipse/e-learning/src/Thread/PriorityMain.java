package Thread;

public class PriorityMain {
	public static void main(String[] args) {
		Food f = new Food();
		Phone p = new Phone();
		
		p.setPriority(Thread.MAX_PRIORITY);
		f.setPriority(Thread.MIN_PRIORITY);
		
		f.start();
		p.start();
		
	}
}
