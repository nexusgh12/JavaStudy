package Thread;

public class Work1 extends Thread{
	Work1(){
		setName("���� ����");
	}
	
	public void run() {
		for(int i = 1; i<=1000; i++) {
			System.out.println(this.getName() + " �۾� �� ...");
		}
	}
}

class Work2 extends Thread{
	Work2(){
		setName("���� ����");
	}
	
	public void run() {
		for(int i = 1; i<=1000; i++) {
			System.out.println(this.getName() + " �۾� �� ...");
		}
	}
}
