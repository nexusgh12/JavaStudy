package Thread;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Pool {
//	List<String> products = new LinkedList<>(Arrays.asList("����", "���찳", "����", "������"));
	List<String> products = new LinkedList<>(Arrays.asList("����", "���찳", "����", "�װ���"));
	public synchronized String get() throws InterruptedException{ //get()�� product�� �ִ� �����͸� �̾Ƴ��� �޼���
		
		while (products.size() == 0) {//�̾Ƴ� �����Ͱ� ������� ��� ���
			wait();
		}
		return products.remove(0);
		
	}
	
	public synchronized void add(String value) {	//add()�� �����͸� �����ϴ� �޼���
		products.add(value);
		notifyAll();
	}
}
