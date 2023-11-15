package LinearStrcture;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("Data 1");
		list.add(178);
		list.add(178.2);
		list.add("Data 2");
		
		for(int i =0; i<list.size(); i++) {
		System.out.println(list.get(i));
		}
		System.out.println(list.get(2));
		System.out.println(list);
		}

	}


