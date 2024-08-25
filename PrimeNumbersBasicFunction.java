class PrimeNumbersBasicFunction 
{
	public static void main(String[] args) 
	{
		isPrime(1);
		isPrime(2);
		isPrime(3);
		isPrime(4);
		isPrime(5);

	}
	public static void isPrime(int num)
		{
		if(num==1)
			{
				System.out.println("Enter any number greater than 1.");
			}
		else
			{
			int count=0;
			for(int i=2;i<=num/2;i++)
				{
					if(num%i==0)
						{
							count=1;
						}
					
				}
				if(count==0)
					{
						System.out.println(num+" is a prime number.");
					}
				else
					System.out.println(num+" is not a prime number.");
		}
		}
}
