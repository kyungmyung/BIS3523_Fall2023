package LinearStrcture;

import java.util.HashSet;
import java.util.Set;

public class HashTest {

	public static void main(String[] args) {
		
		
		Set s = new HashSet();
		s.add("Hello");
		s.add(178);
		s.add("Student");
		s.add(178.3);
		Object[] o = s.toArray();
		for(int i=0; i<s.size(); i++) {
		System.out.println(o[i]);
		}
		System.out.println(s); //System.out.println(s[0]); --> Error Point --> We cannot directly access the HashSet Value.


	}

}
