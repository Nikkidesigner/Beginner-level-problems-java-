class ReverseNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(reverseNumber(12345));
	}
	public static int reverseNumber(int num)
		{
			int temp=num,rev=0;
			while(num>0)
				{
					rev=rev*10+num%10;
					num=num/10;
				}
			return rev;

		}
}
