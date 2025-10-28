import java.util.*;
class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number = ");
		int num = sc.nextInt();
		
		int n1=0 , n2=1, n3, i;
		System.out.print("\nFibonacci Series = "+n1+","+n2+",");
		
		for(i=1; i<=(num-2); i++)
		{
			n3 = n1+n2;
			System.out.print(n3+",");
			n1 = n2;
			n2 = n3;
		}
	}
}