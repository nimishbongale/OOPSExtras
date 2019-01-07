import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ColumnarTechnique{

    static String encryption(String s) {
            int r,c,t=0;
            r=(int)Math.floor(Math.sqrt(s.length()));
            c=(int)Math.ceil(Math.sqrt(s.length()));
            String res="";
            
            if((r*c)<(s.length()))
            r=c;
            
            char result[][]=new char[r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(t>=s.length())
                    result[i][j]='\0';
                    else
                    result[i][j]=s.charAt(t);
                    t++;
                }
            }
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<r;k++)
                res+=result[k][j];
                res+=' ';
            }
          return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        System.out.println("Enter the message: ");
        String s = scanner.nextLine();
        String result = encryption(s);
        System.out.println("Encoded Message: "+result);
        scanner.close();
    }
}
