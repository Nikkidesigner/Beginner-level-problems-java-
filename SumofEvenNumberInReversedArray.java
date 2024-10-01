class SumofEvenNumberInReversedArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {7, 8, 9, 10,5,5};
        Sum(arr);
	}
	public static void Sum(int[] arr)
		{
			int j=0,sum=0;
			for(int i=arr.length-1;i>=0;i--)
				{
					if(i%2==0)
						{
							sum+=arr[j];
						}
						j++;
				}
			System.out.println("The sum is :"+sum);
		}
}
