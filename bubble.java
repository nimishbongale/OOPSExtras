import java.util.Scanner;
class bubble
{
	public static void main(String args[])
	{
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms \t");
		n=sc.nextInt();
		temp=0;
		int a[]=new int[100];
		System.out.println("Enter the terms \t");
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println("The sorted array in ascending order \t");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
	}
}
					
