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
	
	//�޼��忡 ����ȭ 
	public synchronized void draw(long amount) {
		balance -= amount;
	}
	
	public long getBalance() {
		return balance;
	}
}


class DrawThread extends Thread{
	Card card;
	//ī�带 �޾Ƽ� ��������� ��������
	DrawThread(Card card){
		this.card = card;	
	}
	
	public void run() {
		//card��� ��ü�� �������� ���ÿ� ���� �� �� ����ȭ ó�� �ϰڴ�. 
		synchronized(card) {
			for(int i = 0; i < 10; i++) {
				card.draw(10);
				System.out.println(this.getName() + " ��� �� �ܾ� " + card.getBalance());
			}
			
		}
	}
}
