import java.util.*;
class Factorial
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number = ");
		int num = sc.nextInt();
		int fact=1, sum=0;
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
				fact = fact*j;
			}
			sum = sum + fact;
			fact = 1;
		}
		System.out.print("\nSum of factorial = "+sum);
	}
}