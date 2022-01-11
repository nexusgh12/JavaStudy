package Thread;

public class ProductGet implements Runnable{
	Pool pool;
	
	ProductGet(Pool pool){
		this.pool = pool;
	}
	
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				String product = pool.get();
				System.out.print(i + " : " + product);
				System.out.println("��ǰ ���! -> ��� : " + pool.products.size());
			}
		} catch (InterruptedException e	) {
			e.printStackTrace();
		}
	}

}
