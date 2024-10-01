class BitwiseXorandSumofEvenIndex 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,2,3,5,3,4};
		Sum(arr);
	}
	public static void Sum(int[] arr)
		{
		int sum1=0,sum2=0;
			for(int i=0;i<arr.length;i++)
			{
				if(i%2==0)
					{
						sum1+=arr[i];
					}
				else
					{   
						sum2=sum2^arr[i];
					}
			}
			int finalsum=sum1+sum2;
			System.out.println(finalsum);
		}
}
