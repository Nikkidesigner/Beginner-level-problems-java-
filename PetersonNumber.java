class PetersonNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(checkPeterson(773));
	}
	public static String checkPeterson(int num)
		{
			int temp=num,n=0;
			while(temp>0)
				{
					n=n+findFactorial(temp%10);
					temp=temp/10;
				}
			if(n==num)
				{
					return "It is a Peterson Number";
				}
			else
				return "It is not a Peterson Number";
		}
	public static int findFactorial(int num)
		{
		int fact=1;
			while(num>0)
				{
					fact=fact*num;
					num--;
				}
			return fact;
		}
}
