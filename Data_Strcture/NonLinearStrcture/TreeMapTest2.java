package NonLinearStrcture;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest2 {

	public static void main(String[] args) {
		
	    // Take multiple values to tm
		TreeMap<String, String> tm = new TreeMap<String, String>();
		
		tm.put("KM", "10000");
		tm.put("KM", "100000000");
		tm.put("A", "1");
		tm.put("A", "2");
		Set s = tm.keySet();
		Iterator<String> it = s.iterator();
		
		while(it.hasNext())
		{
		String key = it.next();
		String value = tm.get(key);
		System.out.println("key = "+key + ", Value = "+ value);
		}

}
}
