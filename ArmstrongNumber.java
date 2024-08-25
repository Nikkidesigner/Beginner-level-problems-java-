class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		checkArmsStrong(1634);
	}
	public static  void checkArmsStrong(int num)
		{
		int temp=num,power=0,total=0,rem=0;
		
			while(temp>0)
				{
					temp=temp/10;
					power++;
				}
				temp=num;
			while(temp>0)
				{
					
					 rem=temp%10;

					total+=(Math.pow(rem,power));
					temp=temp/10;
				}
				if(total==num)
					{
						System.out.println("armstrong number");
					}
				else
					{
						System.out.println("not an armstrong number");
					}
		}
}
