import java.util.*;
public class HashMapTest
{
    public static void main(String args[])
    {
        int a[]=new int[30];
        int n,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        n=sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            count=1;
            if(a[i]==Integer.MIN_VALUE);
            else{
            for(int j=i+1;j<n;j++)
            {
                if(a[j]==Integer.MIN_VALUE);
                else if(a[j]==a[i])
                {
                    count++;
                    a[j]=Integer.MIN_VALUE;
                }
            }
            hm.put(a[i],count);
        }}
        System.out.print(hm);
    }
}
