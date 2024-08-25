class PallindromeNumberFunction 
{
	public static void main(String[] args) 
	{
		checkPallindromeNumber(121);
		checkPallindromeNumber(122);
		checkPallindromeNumber(12221);
		checkPallindromeNumber(123321);

	}
	public static void checkPallindromeNumber(int num)
		{
			int temp=num,rev=0,rem=0;
			while(num>0)
				{
					rem=num%10;
					rev=rev*10+rem;
					num=num/10;
				}
				if(rev==temp)
					{
						System.out.println(temp+" is a pallindrome number.");
					}
				else
					System.out.println(temp+" is not a pallindrome number.");

		}
}
