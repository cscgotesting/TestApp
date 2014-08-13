package test;

import org.junit.Assert;
import org.junit.Test;

import com.csc.util.MyTest;

public class SampleTest {

	
	MyTest test;
	
	/*@Before
	public void init(){
		test = new MyTest();
	}*/
	
	
	@Test
	public void testSample(){
		test = new MyTest();
		
		Assert.assertEquals("My Java Test Program", test.getMessage());
		
		test.setMessage("hello");
		
		Assert.assertEquals("Hello", test.getMessage());
	}
}
