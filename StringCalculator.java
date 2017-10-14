public class StringCalculator
{
	public static int add(String numbers)
	{
		if(numbers.isEmpty())
		{
			return 0;
		}
		String modifiedNumbers = numbers.replace('\n', ',');
		String[] splitNums = modifiedNumbers.split(",");
		int sum = 0;
		for(int i = 0; i<splitNums.length; i++)
		{
			sum += Integer.parseInt(splitNums[i]);
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
		System.out.println("Testing \"" + s1 + "\" == 0 " + (add(s1) == 0));
		System.out.println("Testing \"" + s2 + "\" == 1 " + (add(s2) == 1));
		System.out.println("Testing \"" + s3 + "\" == 17 " + (add(s3) == 17));
		System.out.println("Testing \"" + s4 + "\"== 40 " + (add(s4) == 40));
		System.out.println("Testing \"" + s5 + "\"== 10 " + (add(s5) == 10));
		System.out.println("Testing \"" + s6 + "\" == 6 " + (add(s6) == 6));
	}
}
