package demo;

public class Occurances 
{
	public static void main(String[] args)
	{
		int[] numbers={107,20,77,77,5,7,97};
		int count = 0;

	    for (int i = 0; i < numbers.length; i++)
	    {
	    	int currentInt = numbers[i];
	    	while(currentInt!=0)
	        {
	        int rem=currentInt%10;
	        if (rem == 7)
	        {
	            count++;
	        }
	        currentInt=currentInt/10;
	    }
	    }
System.out.println(count);
	}
}
