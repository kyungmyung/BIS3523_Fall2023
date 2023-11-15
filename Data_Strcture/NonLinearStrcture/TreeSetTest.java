package NonLinearStrcture;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();
		tree.add(100);
		tree.add(100);
		tree.add(200);
		tree.add(200);
		tree.add(500);
		Iterator it = tree.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
		System.out.println(tree);

}
}
