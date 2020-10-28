
public class Calculator {

	
	private final String demiliter=",|\n";
	public int calculate(String input) throws Exception {
		String[] numbers=input.split(demiliter);
		if(isEmpty(input))
		{
		return 0;
		}
		if(input.length()==1)
		{
			return stringToInt(input);
		}
		else 
		{
			return getSum(numbers);
		}
		
	}
	
	
	private int getSum(String[] numbers) throws Exception
	{
		fireException(numbers);
		int sum=0;
		for(String  i:numbers)
		{
			sum+=stringToInt(i);
		}
		return sum;
		
		}
	
	
	private void fireException(String[] numbers) throws Exception
	{
		for(String  i:numbers)
		{
			if(stringToInt(i)<0)
			{
				throw new Exception("Negative Input");
			}
		}
	}
		
		
	
	
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	private int stringToInt(String input) {
		
		return Integer.parseInt(input);
	}

}
