import java.util.*;
class Pallindrome
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number = ");
		int num = sc.nextInt();
		int temp = num;
		int rev=0,rem;
		while(num!=0)
		{
			rem = num%10;
			rev = (rev*10) + rem;
			num = num/10;
		}
		if(rev==temp)
		{
			System.out.print("\nPallindrome");
		}
		else
		{
			System.out.print("\nNot Pallindrome");
		}
	}
}