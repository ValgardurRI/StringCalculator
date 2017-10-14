public class StringCalculator
{
	public static int add(String numbers)
	{
		if(numbers.isEmpty())
		{
			return 0;
		}
		else if(!numbers.contains(","))
		{
			return Integer.parseInt(numbers);
		}
		else
		{
			String[] splitNums = numbers.split(",");
			return Integer.parseInt(splitNums[0]) + Integer.parseInt(splitNums[1]);
		}

	}

	public static void main(String[] args)
	{
		String s1 = "";
		String s2 = "1";
		String s3 = "8,9";
		System.out.println(add(s1) == 0);
		System.out.println(add(s2) == 1);
		System.out.println(add(s3) == 17);
	}
}
