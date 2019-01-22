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
            if(hm.containsKey(a[i]))
            hm.put(a[i],hm.get(a[i])+1);
            else
            hm.put(a[i],1);
        }
        System.out.print(hm);
    }
}
