import java.util.*;
class NextDate
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date in the form DDMMYYYY : ");
        int inputDate = sc.nextInt();
        int day, month, year;
        int dayInMonth = 0;
		boolean valid = true;
        day = inputDate / 1000000;
        month = (inputDate / 10000) % 100;
        year = inputDate % 10000;

        // Determine number of days in month
        if(month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12)
		{   
			dayInMonth = 31;
		}
        else if(month==4 ||month==6 ||month==9 ||month==11)
        {
			dayInMonth = 30;
		}
        else if(month == 2)
        {
            if((year%400==0) || ((year%4==0)&&(year%100!=0)))
                dayInMonth = 29;
            else
                dayInMonth = 28;
        }
        else
        {
			valid = false;
        }

        // Find next date
        if(day < dayInMonth)
        {
            day++;
        }
        else if(day == dayInMonth)
        {
            day = 1;
			
            if(month < 12)
            {
                month++;
            }
            else if(month == 12)
            {
                month = 1;
                year++;
            }
        }
        else
        {
			valid = false;
        }

        // Printing next date in DDMMYYYY format
		if(valid==true)
		{
			System.out.print("\nNext date : ");
			if(day < 10)
			{
				System.out.print("0");
			}
			System.out.print(day);
			if(month < 10)
			{
				System.out.print("0");
			}
			System.out.print(month);
			System.out.print(year);
		}
		else
		{
            System.out.print("\nInvalid Date Entered.");
		}
    }
}