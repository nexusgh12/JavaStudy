package Thread;

public class PrintThread extends Thread {
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(2000);
				System.out.println("출력 : " + i);
			}
		} catch(Exception e) {
			System.out.println("Interrupt가 발생하여 Sleep 상태를 종료함");
		}
	}
}

//시간 설정 방법
//Thread.sleep(5000); // 5초
//TimeUnit.SECONDS.sleep(5); //5초
//TimeUnit.MINUTES.sleep(1); //1분
