import java.util.Scanner;
class expdemo5
{
	void fuct1()
	{
		try
		{
			int ar[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the elements");
			for(int i=0;i<5;i++)
			{
				ar[i]=sc.nextInt();
			}
			for(int i=0;i<=5;i++)
			{
				System.out.println(ar[i]);
			}
		}
		// we can use multiple catch in singgle try .
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("array problem occurs...."+ae);
		}
		catch(ArithmeticException a)
		{
			System.out.println("division problem occurs....");
		}
	}
	void fuct2()
	{
		System.out.println("second fuction is working");
	}
	public static void main(String args[])
	{
		expdemo5 obj=new expdemo5();
		obj.fuct1();
		obj.fuct2();
	}
}