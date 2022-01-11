package Thread;

class Card {
	private long balance = 1000;
	
	public void draw(long amount) {
		balance -= amount;
	}
	
	public long getBalance() {
		return balance;
	}
}

class Card2 {
	private long balance = 1000;
	
	//메서드에 동기화 
	public synchronized void draw(long amount) {
		balance -= amount;
	}
	
	public long getBalance() {
		return balance;
	}
}


class DrawThread extends Thread{
	Card card;
	//카드를 받아서 멤버변수에 저장해줌
	DrawThread(Card card){
		this.card = card;	
	}
	
	public void run() {
		//card라는 객체를 누군가가 동시에 접근 할 때 동기화 처리 하겠다. 
		synchronized(card) {
			for(int i = 0; i < 10; i++) {
				card.draw(10);
				System.out.println(this.getName() + " 출금 후 잔액 " + card.getBalance());
			}
			
		}
	}
}
