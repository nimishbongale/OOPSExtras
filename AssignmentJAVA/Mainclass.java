package AssignmentJAVA;
import java.util.Scanner;
public class Mainclass
{
   public static void main(String args[])
   {
       String mno,regno,ch;
       Scanner sc=new Scanner(System.in);
       System.out.println("*****ABC Motors (R)*****");
       System.out.println("Enter the registration number:- ");
       regno=sc.next();
       System.out.println("Enter the model number(year of manufacture followed by model type,followed by P or D(for eg:-2017ASDFP):- ");
       mno=sc.next();
       ch=mno.substring(4,8);
       switch(ch)
       {
           case "QWER":
           (new QWE(regno,mno,true,false,false)).display();
           break;
           
           case "QWET":
           (new QWE(regno,mno,true,true,false)).display();
           break;
           
           case "QWEY":
           (new QWE(regno,mno,true,true,true)).display();
           break;
           
           case "ASDF":
           (new ASD(regno,mno,true,false,false)).display();
           break;
           
           case "ASDG":
           (new ASD(regno,mno,true,true,false)).display();
           break;
           
           case "ASDH":
           (new ASD(regno,mno,true,true,true)).display();
           break;
           
           case "ZXCV":
           (new ZXC(regno,mno,true,false,false)).display();
           break;
           
           case "ZXCB":
           (new ZXC(regno,mno,true,true,false)).display();
           break; 
           
           case "ZXCN":
           (new ZXC(regno,mno,true,true,true)).display();
           break;
           
           default:
           System.out.println("Invalid model no.!");
        }
        sc.close();
    }
}

