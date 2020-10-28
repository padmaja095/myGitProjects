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
	public void emptyStringResturnsZero() throws Exception
	{
		
		assertEquals(calculator.calculate(""),0 );
	}
	@Test
	public void singleValueIsReplied() throws Exception
	{
		assertEquals(calculator.calculate("1"),1 );
	}
	@Test
	public void twoNumbersDelimitedReturnSum() throws Exception
	{
		assertEquals(calculator.calculate("1,2"),3 );
	}
	@Test
	public void twoNumberNewLineDelimitedReturnSum() throws Exception
	{
		assertEquals(calculator.calculate("1\n2"),3 );
	}
	@Test
	public void threeNumbersDemilitedBothwaysreturnSum() throws Exception
	{
		assertEquals(calculator.calculate("1,2,3"),6 );
		
	}
	@Test(expected=Exception.class)
	public void negativeInputReturnsException() throws Exception
	{
		calculator.calculate("-1");
	}
	@Test
	public void ignoreNumbersfreaterThanThousand() throws Exception
	{
		assertEquals(calculator.calculate("10,10,1001"),20 );
		
	}
}
