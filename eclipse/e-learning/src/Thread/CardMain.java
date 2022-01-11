package Thread;

public class CardMain {
	public static void main(String[] args) {
		Card card = new Card();
		DrawThread t1 = new DrawThread(card);
		DrawThread t2 = new DrawThread(card);
		
		t1.start();
		t2.start();
		
	}
}
