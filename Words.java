import java.util.*;
class Words
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number = ");
		int num = sc.nextInt();
		int r=0;
		String s = "";
		while(num>0)
		{
			r = num%10;
			switch(r)
			{
				case 0 -> s = "Zero "+s;
				case 2 -> s = "Two "+s;
				case 3 -> s = "Three "+s;
				case 4 -> s = "Four "+s;
				case 5 -> s = "Five "+s;
				case 6 -> s = "Six "+s;
				case 7 -> s = "Seven "+s;
				case 8 -> s = "Eight "+s;
				case 9 -> s = "Nine "+s;
				case 1 -> s = "One "+s;
			}
			num/=10;
		}
		System.out.print("Number in words = "+s);
	}
}