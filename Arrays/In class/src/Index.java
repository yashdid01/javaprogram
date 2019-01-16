import java.util.*;
class Index
{
	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner scan=new Scanner(System.in);
		int i,n;
		for(i=0;i<10;i++)
		{
			System.out.println("Enter "+(i+1)+" value");
			n=scan.nextInt();
			a[i]=n;
		}
		System.out.println("Enter the number you want to find index of");
		n=scan.nextInt();
		for(i=0;i<10;i++)
		{
			if(a[i]==n)
			{
				System.out.println(i);
			}

		}
		for(i=0;i<10;i++)
		{
			if(a[i]!=n)
			{
				continue;
			}
		}
		System.out.println("-1");
			
	}
}