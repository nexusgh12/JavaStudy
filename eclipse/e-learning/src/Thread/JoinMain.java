package Thread;

public class JoinMain {
	public static void main(String[] args) {
		Phone calling = new Phone();
		calling.start();
		
		try {
			calling.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("À½½Ä ¸Ô±â");
	}
}
