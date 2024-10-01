class FindFibonacciSeriesAtPosition 
{
	public static void main(String[] args) 
	{
		System.out.println(FindFibo(9));
	}
	public static int FindFibo(int n)
		{
			int a=0,b=1,c=0;
			for(int i=0;i<n-1;i++)
				{
					c=a+b;
					a=b;
					b=c;
				}
			return c;
		}
}
