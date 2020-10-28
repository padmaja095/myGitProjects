import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	private Calculator calculator;
	@Before
	public void init()
	{
		calculator= new Calculator();
	}
	
	@Test
	public void emptyStringResturnsZero()
	{
		
		assertEquals(calculator.calculate(""),0 );
	}
	@Test
	public void singleValueIsReplied()
	{
		assertEquals(calculator.calculate("1"),1 );
	}
	@Test
	public void twoNumbersDelimitedReturnSum()
	{
		assertEquals(calculator.calculate("1,2"),3 );
	}
	@Test
	public void twoNumberNewLineDelimitedReturnSum()
	{
		assertEquals(calculator.calculate("1\n2"),3 );
	}
	@Test
	public void threeNumbersDemilitedBothwaysreturnSum()
	{
		assertEquals(calculator.calculate("1,2,3"),6 );
		
	}
}
