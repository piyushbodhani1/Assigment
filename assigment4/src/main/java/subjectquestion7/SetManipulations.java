package subjectquestion7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetManipulations {

	public int last() {
		Set<Integer> ele = new HashSet<Integer>();
		ele.add(5);
		ele.add(5);
		ele.add(5);
		ele.add(5);
		ele.add(5);
		ele.add(5);
		ele.add(5);
		ele.add(5);
		ele.add(5);
		ele.add(5);
		ele.add(10);
		ele.add(15);
		ele.add(20);
		ele.add(25);
		ele.add(30);
		ele.add(35);
		ele.add(40);
		ele.add(45);
		ele.add(50);
		ele.add(60);
		int last_element = 0;
		Iterator<Integer> it = ele.iterator();
		while (it.hasNext()) {
			last_element = it.next();
		}
		return last_element;
	}

}
