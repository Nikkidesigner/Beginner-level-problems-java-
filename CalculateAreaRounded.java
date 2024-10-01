import java.lang.Math;
class  CalculateAreaRounded
{
	public static void main(String[] args) 
	{
		System.out.println("Area : "+CalculateArea(6));
	}
	public static int CalculateArea(int l)
		{
		    int a = (int)Math.round(3.14*l*l); 
			return a;
		}
}
  