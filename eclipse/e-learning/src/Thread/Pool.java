package Thread;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Pool {
//	List<String> products = new LinkedList<>(Arrays.asList("연필", "지우개", "볼펜", "형광펜"));
	List<String> products = new LinkedList<>(Arrays.asList("연필", "지우개", "볼펜", "항공편"));
	public synchronized String get() throws InterruptedException{ //get()은 product에 있는 데이터를 뽑아내는 메서드
		
		while (products.size() == 0) {//뽑아낼 데이터가 없을경우 잠시 대기
			wait();
		}
		return products.remove(0);
		
	}
	
	public synchronized void add(String value) {	//add()는 데이터를 삽입하는 메서드
		products.add(value);
		notifyAll();
	}
}
