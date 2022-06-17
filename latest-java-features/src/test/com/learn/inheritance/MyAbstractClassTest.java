package test.com.learn.inheritance;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyAbstractClassTest {
	@Test
	void testMethod1() throws Exception {
		System.out.println(Mockito.mock(MyAbstractClass.class, Mockito.CALLS_REAL_METHODS).method1());

	}
}
