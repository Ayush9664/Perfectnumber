package bridgelabz;
import java.util.Scanner;
public class Perfectnumber {
	public static void main(String args[])
	{
		long n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		n=sc.nextLong();
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.printf(n+"is a perfect number");
		}
		else
			System.out.print(n+"is not a perfect number");
	}

}
