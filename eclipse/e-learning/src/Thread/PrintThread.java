package Thread;

public class PrintThread extends Thread {
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(2000);
				System.out.println("��� : " + i);
			}
		} catch(Exception e) {
			System.out.println("Interrupt�� �߻��Ͽ� Sleep ���¸� ������");
		}
	}
}

//�ð� ���� ���
//Thread.sleep(5000); // 5��
//TimeUnit.SECONDS.sleep(5); //5��
//TimeUnit.MINUTES.sleep(1); //1��
