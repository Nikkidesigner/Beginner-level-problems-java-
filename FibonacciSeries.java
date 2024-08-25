class FibonacciSeries  
{
	public static void main(String[] args) 
	{
		Fibonacci(10);

	}
	public static void Fibonacci(int n)
		{
		int a=0,b=1,c=0;
			System.out.print(a+"\t"+b);
			for(int i=0;i<n;i++)
				{
					c=a+b;
					int temp=b;
					b=c;
					a=temp;
					System.out.print("\t"+c);
				}
				System.out.println();

		}
}
