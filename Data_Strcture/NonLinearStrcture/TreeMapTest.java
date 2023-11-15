package NonLinearStrcture;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		tm.put("KM", "10000");
		tm.put("KM", "100000000");
		tm.put("A", "1");
		tm.put("A", "2");
		Set s = tm.keySet();
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
		String key = (String)it.next();
		String value = (String)tm.get(key);
		System.out.println("key = "+key + ", Value = "+ value);
		}

}
}
