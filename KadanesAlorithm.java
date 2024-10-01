class  KadanesAlorithm
{
	public static int KadaneAlgo(int[] arr)
		{
			int sum=0,maxi=arr[0];
			for(int i=0;i<arr.length;i++)
				{
					sum+=arr[i];
					maxi=max(maxi,sum);
					if(sum<0)
					{
						sum=0;
					}

				}
				return maxi;
		}
		public static int max(int a , int b)
			{
				if(a>b)
					return a;

				else
					return b;
			}
	
	public static void main(String[] args) 
	{
		int[] arr={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("largest sum of contiguous subarray :"+KadaneAlgo(arr));
	}
}
