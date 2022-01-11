package Thread;

public class ProductMain {
	public static void main(String[] args) {
		Pool pool = new Pool();
		Thread productGet = new Thread(new ProductGet(pool));
		Thread productAdd = new Thread(new ProductAdd(pool));
		
		productGet.start();
		productAdd.start();
	}
}
