class ConvertDecimalToBinary 
{
	public static void main(String[] args) 
	{
		DecitoBin(10);
	}
	public static void DecitoBin(int n)
	{
		int[] bin = new int[1000];
		int i=0;
		while(n>0)
			{
				bin[i]=n%2;
				n=n/2;
				i++;
			}
		for(int j=i-1;j>=0;j--)
			{
				System.out.print(bin[j]);
			}
			System.out.println();
	}
}
