import java.util.*;
class  Date
{
	int month;
	int day;
	int year;
	Date()
	{
		month=1;
		day=1;
		year=2000;
	}
	Date(int month,int day,int year)
	{
		this.month=month;
		this.day=day;
		this.year=year;
	}
	void displayDate()
	{
		System.out.println("the date is: "+day+"/"+month+"/"+year);
	}
}
	class DateTest
	{
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			Date d1=new Date();
			d1.displayDate();
			Date d2;
			System.out.println("Enter month,day,year");
			int d=scan.nextInt();
			int m=scan.nextInt();
			int y=scan.nextInt();
			d2=new Date(d,m,y);
			d2.displayDate();

		}
	}
	
	
	