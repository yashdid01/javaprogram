import java.util.*;
class Relational
{
	public static void main(String[] args) {
		Scanner consoleInput= new Scanner(System.in);
		int a,b;
		System.out.println("Enter values of a and b");
		a=consoleInput.nextInt();
		b=consoleInput.nextInt();
		


		if(a==b)
		{
			System.out.println("a is equal to b");
		}
		 if(a!=b)
		{
			System.out.println("a is not equal to b");
		}
		 if(a>b)
		{
			System.out.println("a is greater than b");
		}
		 if(a<b)
		{
			System.out.println("a is smaller than b");
		}
		if(a>=b)
		{
			System.out.println("a is greater than or equals to b");
		}
		if(a<=b)
		{
			System.out.println("a is smaller than or equals to b");
		}
		int c,d;
		c=1;
		d=2;
		if((c==1)&&(d==2))
		{
			System.out.println("a is"+a+" and b is "+b );
		}
		if((c==1)||(d==1))
		{
			System.out.println("value a is"+a+" OR "+"b is "+b);	
		}


		




	}
}