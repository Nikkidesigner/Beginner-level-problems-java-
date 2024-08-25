class FactorialFunction 
{
	public static void main(String[] args) 
	{
		calculateFactorial(5);
	}
	public static void calculateFactorial(int num)
		{
			int temp=num,fact=1;
			while(temp>0)
			{
			fact= fact*temp;
			temp--;
			}
		System.out.println(fact);
		}
}
