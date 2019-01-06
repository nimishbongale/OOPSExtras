import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConvertor {

      static String timeConversion(String s) {
       int hour,minute,second;
       String frm;
       hour=Integer.parseInt(s.substring(0,2));
       minute=Integer.parseInt(s.substring(3,5));
       second=Integer.parseInt(s.substring(6,8));
       frm=s.substring(8,10);
       System.out.println(hour+" "+minute+" "+second+"  "+frm);
       if((hour>12)||(minute>59)||(second>59)||!(frm.equalsIgnoreCase("AM")||frm.equalsIgnoreCase("PM")))
       {
           System.out.println("Invalid time!");
           System.exit(0);
        }
       if(s.charAt(8)=='P')
       {
           if(hour==12)
           hour=12;
           else
           hour+=12;
       s=s.replace(s.substring(0,2),(Integer.toString(hour)));
       }
       else if((s.charAt(8)=='A')&&(hour==12))
       {
              hour=0;
            s=s.replace(s.substring(0,2),Integer.toString(hour)+'0');
        }
       return (s.substring(0,8));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the time in a 12hr format (HH:MM:SSAM or HH:MM:SSPM):");
       String s = scan.nextLine();
       String result = timeConversion(s);
        System.out.println("24hr format:"+result);
    }
}
