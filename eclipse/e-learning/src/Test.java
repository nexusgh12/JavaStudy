import java.util.*;

public class Test {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("ȫ�浿", new Integer(90));
		map.put("ȫ�浿", new Integer(100));
		
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸�: " + e.getKey() + ", ���� : " + e.getValue() );
		}
		
	}
}
