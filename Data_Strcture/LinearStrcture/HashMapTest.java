package LinearStrcture;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		m.put("1", "KM");
		m.put("2", "KM2");
		System.out.println(m.get(1));
		System.out.println(m.get("1"));

	}

}
