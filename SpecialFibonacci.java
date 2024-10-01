import java.util.Scanner;

class SpecialFibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the nth term:");
		int n = sc.nextInt();
		fibonacci(n);

	}

	public static void fibonacci(int n)
		{
		
			int a=1,b=1,c=0,temp=0;
			System.out.printf(a+"\t"+b);
            for(int i=0;i<=n-2;i++)
				{
					c=(a*a)+(b*b);
                    a=b;
					b=c;
					System.out.printf("\t"+c);
				}
			int ans = (c%47);
			System.out.println("\n"+ans);
		}

}
