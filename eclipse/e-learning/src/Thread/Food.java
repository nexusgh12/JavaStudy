package Thread;

 class Food extends Thread {
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("음식 먹기 : " + i);
		}
	}
}

 class Phone extends Thread{
	 public void run() {
		 for(int i = 1; i <= 1000; i++) {
			 System.out.println("전화 받기 : " + i);
		 }
	 }
 }
