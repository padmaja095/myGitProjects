
public class Calculator {

	
	private final String demiliter=",|\n";
	public int calculate(String input) {
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
	
	
	private int getSum(String[] numbers)
	{
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum+=Integer.parseInt(numbers[i]);
		}
		return sum;
		
		}
		
		
	
	
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	private int stringToInt(String input) {
		
		return Integer.parseInt(input);
	}

}
