public class StringCalculator
{
	public static int add(String numbers)
	{
		if(numbers.isEmpty())
		{
			return 0;
		}
		
		String modifiedNumbers = numbers.replace('\n', ',');	

		if(numbers.startsWith("//"))
		{
			char delimiter = numbers.charAt(2);
			modifiedNumbers = modifiedNumbers.replace(delimiter, ',');
			modifiedNumbers = modifiedNumbers.substring(4);
		}

		String[] splitNumbers = modifiedNumbers.split(",");
		int sum = 0;
		String invalidNumbers = "";

		for(int i = 0; i<splitNumbers.length; i++)
		{
			int currentNumber = Integer.parseInt(splitNumbers[i]);
			if(currentNumber > 1000)
			{
				continue;
			}

			if(currentNumber < 0)
			{
				if(!invalidNumbers.isEmpty())
				{
					invalidNumbers += ",";
				}
				invalidNumbers += currentNumber;
			}
			sum += currentNumber;
		}

		if(!invalidNumbers.isEmpty())
		{
			throw new IllegalArgumentException("Negatives not allowed: " + invalidNumbers);
		}

		return sum;
	}

	public static void main(String[] args)
	{
		String s1 = "";
		System.out.println("Generating string s1: \"" + s1 + "\"");
		String s2 = "1";
		System.out.println("Generating string s2: \"" + s2 + "\"");
		String s3 = "8,9";
		System.out.println("Generating string s3: \"" + s3 + "\"");
		String s4 = "10,10,10,10";
		System.out.println("Generating string s4: \"" + s4 + "\"");
		String s5 = "1,1,1,1,1,1,1,1,1,1";
		System.out.println("Generating string s5: \"" + s5 + "\"");	
		String s6 = "1\n2,3";
		System.out.println("Generating string s6: \"" + s6 + "\"");
		String s7 = "-1";
		System.out.println("Generating string s7: \"" + s7 + "\"");
		String s8 = "1,-7,-3,2,-1";
		System.out.println("Generating string s8: \"" + s8 + "\"");
		String s9 = "1,9,1001";
		System.out.println("Generating string s9: \"" + s9 + "\"");
		String s10 = "1,10,100,1000,2000,9999";
		System.out.println("Generating string s10: \"" + s10 + "\"");
		String s11 = "//a\n1a2a3";
		System.out.println("Generating string s11: \"" + s11 + "\"");
		String s12 = "//;\n100;80;60;50";
		System.out.println("Generating string s12: \"" + s12 + "\"");

		System.out.println("Testing \"" + s1 + "\" == 0 " + (add(s1) == 0));
		System.out.println("Testing \"" + s2 + "\" == 1 " + (add(s2) == 1));
		System.out.println("Testing \"" + s3 + "\" == 17 " + (add(s3) == 17));
		System.out.println("Testing \"" + s4 + "\" == 40 " + (add(s4) == 40));
		System.out.println("Testing \"" + s5 + "\" == 10 " + (add(s5) == 10));
		System.out.println("Testing \"" + s6 + "\" == 6 " + (add(s6) == 6));
		
		System.out.println("Testing \"" + s7 + "\"");
		try
		{
			add(s7);
			System.out.println("An exception should have been cought by now!");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

		System.out.println("Testing \"" + s8 + "\"");
		try
		{
			add(s8);
			System.out.println("An exception should have been cought by now!");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

		System.out.println("Testing \"" + s9 + "\" == 10 " + (add(s9) == 10));
		System.out.println("Testing \"" + s10 + "\" == 1111 " + (add(s10) == 1111));
		System.out.println("Testing \"" + s11 + "\" == 6 " + (add(s11) == 6));
		System.out.println("Testing \"" + s12 + "\" == 290 " + (add(s12) == 290));
	}
}
