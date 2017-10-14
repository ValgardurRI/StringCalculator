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
			int sum = 0;
			for(int i = 0; i<splitNums.length; i++)
			{
				sum += Integer.parseInt(splitNums[i]);
			}
			return sum;
		}

	}

	public static void main(String[] args)
	{
		String s1 = "";
		String s2 = "1";
		String s3 = "8,9";
		String s4 = "10,10,10,10";
		String s5 = "1,1,1,1,1,1,1,1,1,1";
		System.out.println(add(s1) == 0);
		System.out.println(add(s2) == 1);
		System.out.println(add(s3) == 17);
		System.out.println(add(s4) == 40);
		System.out.println(add(s5) == 10);
	}
}
