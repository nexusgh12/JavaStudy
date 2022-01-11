package Thread;

public class FoodMain {
	public static void main(String[] args) {
		Food work1 = new Food();
		Phone work2 = new Phone();
		
		work1.start();
		work2.start();
		
		for(int i = 1; i <= 1000; i++) {
			System.out.println("Àáµé±â : " + i);
		}
	}
}
