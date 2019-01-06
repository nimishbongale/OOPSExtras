import java.math.BigInteger;
import java.util.Scanner;
public class Largenos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BigInteger fact=BigInteger.ONE;
        int n;
        System.out.println("Enter the number to find factorial:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
          fact=fact.multiply(new BigInteger(Integer.toString(i)));
          System.out.print("Result="+fact.toString());
    }
}
