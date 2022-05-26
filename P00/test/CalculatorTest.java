import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	//For the testAdd method
	private int a,b;
	Calculator cal = new Calculator();
	
	@Before
	public void setUp() throws Exception {
	//For every method after testAdd
		//Arrange
		a = 4321;
		b = 1234;
		Calculator cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//Act
		int actual = cal.add(a, b);
		
		//Assert
		int expected = 5555;
		assertEquals (expected, actual);
	}

	@Test
	public void testSubtract() {
		//Act
		int actual = cal.subtract(a, b);
		
		//Assert
		int expected = 3087;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiple() {
		//Act
		int actual = cal.multiple(a, b);
		
		//Assert
		int expected = 5332114;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		//Arrange
		int a = 10;
		int b = 2;
		int actual = 0;
		
		try {
			//Act
			actual = cal.divide(a, b);
			int expected = 5;
			
			//Assert
			assertEquals (expected, actual);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
