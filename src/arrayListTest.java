import static org.junit.Assert.*;

import org.junit.Test;

public class arrayListTest {

	@Test
	public void test() {
		MyArrayList mal = new MyArrayList();
		mal.add(3);
		mal.add(2);
		mal.add(1);
		assertEquals(3, mal.get(0));
		assertEquals(2, mal.get(1));
		assertEquals(1, mal.get(2));
		assertEquals(2, mal.remove(1));
		MyArrayList<String> mal1 = new MyArrayList<String>();
	}



}
