package Thread;

 class Food extends Thread {
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("���� �Ա� : " + i);
		}
	}
}

 class Phone extends Thread{
	 public void run() {
		 for(int i = 1; i <= 1000; i++) {
			 System.out.println("��ȭ �ޱ� : " + i);
		 }
	 }
 }
