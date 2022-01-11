package Thread;

public class Work1 extends Thread{
	Work1(){
		setName("파일 저장");
	}
	
	public void run() {
		for(int i = 1; i<=1000; i++) {
			System.out.println(this.getName() + " 작업 중 ...");
		}
	}
}

class Work2 extends Thread{
	Work2(){
		setName("서버 연결");
	}
	
	public void run() {
		for(int i = 1; i<=1000; i++) {
			System.out.println(this.getName() + " 작업 중 ...");
		}
	}
}
