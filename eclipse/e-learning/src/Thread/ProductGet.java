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
				System.out.println("상품 출고! -> 재고 : " + pool.products.size());
			}
		} catch (InterruptedException e	) {
			e.printStackTrace();
		}
	}

}
