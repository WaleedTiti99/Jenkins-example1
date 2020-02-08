package mavendemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void addtest() {
		myAddClass junit = new myAddClass();
		int result = junit.add(4, 7);
		assertEquals(11,result);
		
	}

}
