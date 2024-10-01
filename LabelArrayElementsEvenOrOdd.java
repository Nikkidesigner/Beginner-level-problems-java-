class LabelArrayElementsEvenOrOdd 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,9,8,7,4};
		Label(arr);
	}
	public static void Label(int[] arr)
		{
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<arr.length;i++)
				{
					if(arr[i]%2==0)
						{
							sb=sb.append("Even");
						}
					else
						sb=sb.append("Odd");
				}
			System.out.println(sb);
		}
}
