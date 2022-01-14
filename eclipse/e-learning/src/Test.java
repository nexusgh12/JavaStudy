import java.util.*;

public class Test {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("È«±æµ¿", new Integer(90));
		map.put("È«±æµ¿", new Integer(100));
		
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("ÀÌ¸§: " + e.getKey() + ", Á¡¼ö : " + e.getValue() );
		}
		
	}
}
