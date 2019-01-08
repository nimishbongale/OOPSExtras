import java.io.*;
class Othello1
{
    public static String A[][]=new String[8][8];
    public static int count1=0,countX=0,countO=0,i=0,j=0,e=0,f=0,c=0,d=0,g=0,h=0,count2=-1,m=0;
    public static int count4=1;
    public static String player1="",player2="";
    public static void main()throws Exception
    {
        count2=-1;
        System.out.println("X starts first and X is black");
        BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name of first player(X/Black): ");
        player1=z.readLine();
        System.out.print("Enter name of second player(O/White): ");
        player2=z.readLine();
        System.out.println();
        System.out.println("Use numbers given below as reference to the place you want to choose\nREFERENCE TABLE");
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                if(i==3 && j==3 || i==4 && j==4)
                A[i][j]="X";
                else if(i==3 && j==4 || i==4 && j==3)
                A[i][j]="O";
                else
                A[i][j]=i+""+j;
            }
        }
        
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                if(j>=0 && j<=6)
                {
                    System.out.print(" | "+A[i][j]+"");
                }
                else
                System.out.print(" "+A[i][j]);     
                if(j==6)
                System.out.print(" |");
                if(j==7)
                System.out.print(" |");
            }
            System.out.println();
            if(i>=0 && i<=7)
            System.out.println("--------------------------------------");
        }
        System.out.println("*******************************************************************************");
        System.out.println("\n\t\t\t\tThe Game Starts...");
        z.close();
        XorO();
    }
    
       public static void XorO()throws Exception
    {
        count2++;
        if(count2%2==0)
        Oinput();
        else
        Xinput();
    }
    
    public static void Xinput() throws Exception
    {
        BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(player1+" enter choice using reference table: ");
        m=Integer.parseInt(z.readLine());
        System.out.println("\n");
        c=m/10;
        d=m%10;
        if(c<0 || c>8 || d<0 || d>8 )
        {
            System.out.println("Invalid choice. Try again.");
            Xinput();
        }
        
        if( A[c][d]=="O")
        {
            System.out.println("Invalid choice. "+player2+" has placed there. Try again.");
            Xinput();
        }
        else if(A[c][d]=="X")
        {
            System.out.println("Invalid choice. You already have placed there. Try again.");
            Xinput();
        }
        
        if(c>0 && d>0 && e<8 && d<8)
        {
            if(A[c-1][d]=="X" || A[c+1][d]=="X" || A[c+1][d+1]=="X" || A[c-1][d-1]=="X" ||
            A[c-1][d+1]=="X" || A[c+1][d-1]=="X" || A[c][d+1]=="X" || A[c][d-1]=="X" || 
            A[c-1][d]=="O" || A[c+1][d]=="O" || A[c+1][d+1]=="O" || A[c-1][d-1]=="O" ||
            A[c-1][d+1]=="O" || A[c+1][d-1]=="O" || A[c][d+1]=="O" || A[c][d-1]=="O")
             {
                A[c][d]="X";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Xinput();
                }

        }
        else if(c==0 && d==1 || c==0 && d==2 || c==0 && d==3 || c==0 && d==4 || c==0 && d==5 ||
        c==0 && d==6 || c==0 && d==7)
        {
            if(A[c+1][d]=="X" || A[c+1][d+1]=="X" || A[c][d+1]=="X" || A[c+1][d-1]=="X" ||
            A[c][d-1]=="X" || A[c+1][d]=="O" || A[c+1][d+1]=="O" || A[c][d+1]=="O" || 
            A[c+1][d-1]=="O" || A[c][d-1]=="O")
            {
                A[c][d]="X";
                Flipping();
            }
            else
           {
                    System.out.println("You cannot place there according to the rules of othello");
                    Xinput();
                }
        }
        else if(c==0 && d==0)
        {
            if(A[c+1][d]=="X" || A[c+1][d+1]=="X" || A[c][d+1]=="X" ||
            A[c+1][d]=="O" || A[c+1][d+1]=="O" || A[c][d+1]=="O")
            {
                A[c][d]="X";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Xinput();
                }
        }
        else if(c==0 && d==8)
        {
            if(A[c+1][d]=="X" || A[c+1][d-1]=="X" || A[c][d-1]=="X" ||
            A[c+1][d]=="O" || A[c+1][d-1]=="O" || A[c][d-1]=="O")
            {
                A[c][d]="X";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Xinput();
                }
        }
        else if(c==1 && d==0 || c==2 && d==0 || c==3 && d==0 || c==4 && d==0 || c==5 && d==0 || 
        c==6 && d==0 || c==7 && d==0)
        {
            if(A[c-1][d]=="X" || A[c-1][d+1]=="X" || A[c][d+1]=="X" || A[c+1][d+1]=="X" ||
            A[c+1][d]=="X" || A[c-1][d]=="O" || A[c-1][d+1]=="O" || A[c][d+1]=="O" || 
            A[c+1][d+1]=="O" || A[c+1][d]=="O")
            {
                A[c][d]="X";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Xinput();
                }
        }
        
        
        else if(c==8 && d==1 || c==8 && d==2 || c==8 && d==3 || c==8 && d==4 || c==8 && d==5 ||
        c==8 && d==6 || c==8 && d==7) 
        {
            if(A[c-1][d]=="X" || A[c-1][d-1]=="X" || A[c][d-1]=="X" || A[c-1][d+1]=="X" ||
            A[c][d+1]=="X" || A[c-1][d]=="O" || A[c-1][d-1]=="O" || A[c][d-1]=="O" || 
            A[c-1][d+1]=="O" || A[c][d+1]=="O")
            {
                A[c][d]="X";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Xinput();
                }
        }
        else if(c==8 && d==0)
        {
            if(A[c-1][d]=="X" || A[c-1][d+1]=="X" || A[c][d+1]=="X" ||
            A[c-1][d]=="O" || A[c-1][d+1]=="O" || A[c][d+1]=="O")
            {
                A[c][d]="X";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Xinput();
                }
        }
        else if(c==8 && d==8)
        {
            if(A[c-1][d]=="X" || A[c-1][d-1]=="X" || A[c][d-1]=="X" ||
            A[c-1][d]=="O" || A[c-1][d-1]=="O" || A[c][d-1]=="O")
            {
                A[c][d]="X";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Xinput();
                }
        }
        else if(c==1 && d==8 || c==2 && d==8 || c==3 && d==8 || c==4 && d==8 || c==5 && d==8 ||
        c==6 && d==8 || c==7 && d==8)
        {
            if(A[c-1][d]=="X" || A[c-1][d-1]=="X" || A[c][d-1]=="X" || A[c+1][d-1]=="X" ||
            A[c+1][d]=="X" || A[c-1][d]=="O" || A[c-1][d-1]=="O" || A[c][d-1]=="O" || 
            A[c+1][d-1]=="O" || A[c+1][d]=="O")
            {
                A[c][d]="X";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Xinput();
                }
        }
       
        z.close();
        Flipping();
        
    }
    
    public static void Oinput() throws Exception
    {
        BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(player1+" enter choice using reference table: ");
        m=Integer.parseInt(z.readLine());
        System.out.println("\n");
        c=m/10;
        d=m%10;
        if(c<0 || c>8 || d<0 || d>8 )
        {
            System.out.println("Invalid choice. Try again.");
            Oinput();
        }
        
        if( A[c][d]=="O")
        {
            System.out.println("Invalid choice. You have already placed there. Try again.");
            Oinput();
        }
        else if(A[c][d]=="X")
        {
            System.out.println("Invalid choice. "+player2+" has placed there. Try again.");
            Oinput();
        }
        
        if(c>0 && d>0 && e<8 && d<8)
        {
            if(A[c-1][d]=="X" || A[c+1][d]=="X" || A[c+1][d+1]=="X" || A[c-1][d-1]=="X" ||
            A[c-1][d+1]=="X" || A[c+1][d-1]=="X" || A[c][d+1]=="X" || A[c][d-1]=="X" || 
            A[c-1][d]=="O" || A[c+1][d]=="O" || A[c+1][d+1]=="O" || A[c-1][d-1]=="O" ||
            A[c-1][d+1]=="O" || A[c+1][d-1]=="O" || A[c][d+1]=="O" || A[c][d-1]=="O")
             {
                A[c][d]="O";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Oinput();
                }

        }
        else if(c==0 && d==1 || c==0 && d==2 || c==0 && d==3 || c==0 && d==4 || c==0 && d==5 ||
        c==0 && d==6 || c==0 && d==7)
        {
            if(A[c+1][d]=="X" || A[c+1][d+1]=="X" || A[c][d+1]=="X" || A[c+1][d-1]=="X" ||
            A[c][d-1]=="X" || A[c+1][d]=="O" || A[c+1][d+1]=="O" || A[c][d+1]=="O" || 
            A[c+1][d-1]=="O" || A[c][d-1]=="O")
            {
                A[c][d]="O";
                Flipping();
            }
            else
           {
                    System.out.println("You cannot place there according to the rules of othello");
                    Oinput();
                }
        }
        else if(c==0 && d==0)
        {
            if(A[c+1][d]=="X" || A[c+1][d+1]=="X" || A[c][d+1]=="X" ||
            A[c+1][d]=="O" || A[c+1][d+1]=="O" || A[c][d+1]=="O")
            {
                A[c][d]="O";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Oinput();
                }
        }
        else if(c==0 && d==8)
        {
            if(A[c+1][d]=="X" || A[c+1][d-1]=="X" || A[c][d-1]=="X" ||
            A[c+1][d]=="O" || A[c+1][d-1]=="O" || A[c][d-1]=="O")
            {
                A[c][d]="O";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Oinput();
                }
        }
        else if(c==1 && d==0 || c==2 && d==0 || c==3 && d==0 || c==4 && d==0 || c==5 && d==0 || 
        c==6 && d==0 || c==7 && d==0)
        {
            if(A[c-1][d]=="X" || A[c-1][d+1]=="X" || A[c][d+1]=="X" || A[c+1][d+1]=="X" ||
            A[c+1][d]=="X" || A[c-1][d]=="O" || A[c-1][d+1]=="O" || A[c][d+1]=="O" || 
            A[c+1][d+1]=="O" || A[c+1][d]=="O")
            {
                A[c][d]="O";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Oinput();
                }
        }
        
        
        else if(c==8 && d==1 || c==8 && d==2 || c==8 && d==3 || c==8 && d==4 || c==8 && d==5 ||
        c==8 && d==6 || c==8 && d==7) 
        {
            if(A[c-1][d]=="X" || A[c-1][d-1]=="X" || A[c][d-1]=="X" || A[c-1][d+1]=="X" ||
            A[c][d+1]=="X" || A[c-1][d]=="O" || A[c-1][d-1]=="O" || A[c][d-1]=="O" || 
            A[c-1][d+1]=="O" || A[c][d+1]=="O")
            {
                A[c][d]="O";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Oinput();
                }
        }
        else if(c==8 && d==0)
        {
            if(A[c-1][d]=="X" || A[c-1][d+1]=="X" || A[c][d+1]=="X" ||
            A[c-1][d]=="O" || A[c-1][d+1]=="O" || A[c][d+1]=="O")
            {
                A[c][d]="O";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Oinput();
                }
        }
        else if(c==8 && d==8)
        {
            if(A[c-1][d]=="X" || A[c-1][d-1]=="X" || A[c][d-1]=="X" ||
            A[c-1][d]=="O" || A[c-1][d-1]=="O" || A[c][d-1]=="O")
            {
                A[c][d]="O";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Oinput();
                }
        }
        else if(c==1 && d==8 || c==2 && d==8 || c==3 && d==8 || c==4 && d==8 || c==5 && d==8 ||
        c==6 && d==8 || c==7 && d==8)
        {
            if(A[c-1][d]=="X" || A[c-1][d-1]=="X" || A[c][d-1]=="X" || A[c+1][d-1]=="X" ||
            A[c+1][d]=="X" || A[c-1][d]=="O" || A[c-1][d-1]=="O" || A[c][d-1]=="O" || 
            A[c+1][d-1]=="O" || A[c+1][d]=="O")
            {
                A[c][d]="O";
                Flipping();
            }
            else
            {
                    System.out.println("You cannot place there according to the rules of othello");
                    Oinput();
                }
        }
       
        z.close();
        Flipping();
    }
    public static void Flipping() throws Exception
    {
        if(count2%2==0)
        {
            for(e=d+1;e<8;e++)
            {
                if(A[c][e]=="X")
                {
                    for(f=e-1;f>d;f--)
                    {
                        if(A[c][f]=="O")
                        A[c][f]="X";
                        else
                        continue;
                    }
                }
                else
                continue;
            }
            
            for(e=d;e>=0;e--)
            {
                if(A[c][e]=="X")
                {
                    for(f=e;f<8;f++)
                    {
                        if(A[c][f]=="O")
                        A[c][f]="X";
                    
                    }
                } 
            }
            
            for(e=c;e<8;e++)
            {
                if(A[e][d]=="X")
                {
                    for(f=e;f>=0;f--)
                    {
                        if(A[f][d]=="O")
                        A[f][d]="X";
                    }
                }
            }
            
            for(e=c;e<8;e++)
            {
                for(f=d;f<8;f++)
                {
                    if((e-1)-e==-1 && (f-1)-f==-1)
                    {
                        if(A[e][f]=="X")
                        { 
                            for(g=e;g>0;g--)
                            {
                                for(h=f;h>0;h--)
                                {
                                    if(A[g][h]=="O")
                                    A[g][h]="X";
                                }
                            }
                        }
                    }
                }
            }
            
            for(e=c-1;e>=0;e--)
            {
                for(f=d+1;f<=c;f++)
                {
                    if(A[e][f]=="X")
                    {
                        for(g=e;g<c+1;g++)
                        {
                            for(h=f;h>=0;h--)
                            {
                                if(A[g][h]=="O")
                                A[g][h]="X";
                            }
                        }
                    }
                }
            }
            
            for(e=c+1;e<=d;e++)
            {
                for(f=d-1;f>=0;f--)
                {
                    if(A[e][f]=="X")
                    {
                        for(g=e;g>=0;g--)
                        {
                            for(h=f;h<=e;h++)
                            {
                                if(A[g][h]=="O")
                                A[g][h]="X";
                            }
                        }
                    }          
                }
            }
        }
        
        else
        {
            for(e=d+1;e<8;e++)
            {
                if(A[c][e]=="X")
                {
                    for(f=e-1;f>d;f--)
                    {
                        if(A[c][f]=="X")
                        A[c][f]="O";
                        else
                        continue;
                    }
                }
                else
                continue;
            }
            
            for(e=d;e>=0;e--)
            {
                if(A[c][e]=="X")
                {
                    for(f=e;f<8;f++)
                    {
                        if(A[c][f]=="X")
                        A[c][f]="O";
                    
                    }
                } 
            }
            
            for(e=c;e<8;e++)
            {
                if(A[e][d]=="O")
                {
                    for(f=e;f>=0;f--)
                    {
                        if(A[f][d]=="X")
                        A[f][d]="O";
                    }
                }
            }
            
            
            
            for(e=c;e<8;e++)
            {
                for(f=d;f<8;f++)
                {
                    if((e-1)-e==-1 && (f-1)-f==-1)
                    {
                        if(A[e][f]=="O")
                        { 
                            for(g=e;g>0;g--)
                            {
                                for(h=f;h>0;h--)
                                {
                                    if(A[g][h]=="X")
                                    A[g][h]="O";
                                }
                            }
                        }
                    }
                }
            }
            
            for(e=c-1;e>=0;e--)
            {
                for(f=d+1;f<=c;f++)
                {
                    if(A[e][f]=="O")
                    {
                        for(g=e;g<c+1;g++)
                        {
                            for(h=f;h>=0;h--)
                            {
                                if(A[g][h]=="X")
                                A[g][h]="O";
                            }
                        }
                    }
                }
            }
            
            for(e=c+1;e<=d;e++)
            {
                for(f=d-1;f>=0;f--)
                {
                    if(A[e][f]=="O")
                    {
                        for(g=e;g>=0;g--)
                        {
                            for(h=f;h<=e;h++)
                            {
                                if(A[g][h]=="X")
                                A[g][h]="O";
                            }
                        }
                    }          
                }
            }
        }
        Check();
    }
    
    public static void Check() throws Exception
    {
        count1=0;
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                if(A[i][j]!="X" || A[i][j]!="O")
                count1++;
                else
                continue;
            }
        }
        
        if(count1==0)
        {
            for(i=0;i<8;i++)
            {
                for(j=0;j<8;j++)
                {
                    if(A[i][j]=="X")
                    countX++;
                    else if(A[i][j]=="O")
                    countO++;
                    else
                    continue;
                }
            }
            End();
        }
        else
        Print();
    }
    
    public static void Print() throws Exception
    {
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                if(A[i][j]!="X" && A[i][j]!="O")
                A[i][j]=" ";
                else
                continue;
            }
        }
        
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                if(j>=0 && j<=6)
                {
                System.out.print(" | "+A[i][j]+"");
                }
                else
                System.out.print(" "+A[i][j]);     
                if(j==6)
                System.out.print(" |");
                if(j==7)
                System.out.print(" |");
            }
            System.out.println();
            if(i>=0 && i<=7)
            System.out.println("-------------------------------------------");
        }
        XorO();
    }
    
    public static void End() throws Exception
    {
        char Winner=' ';
        if(countX>countO)
        Winner='X';
        else if(countO>countX)
        Winner='O';
        else
        Winner='D';
        
        if(Winner=='X')
        System.out.println("Winner is X");
        else if(Winner=='O')
        System.out.println("Winner is O");
        else if(Winner=='D')
        System.out.println("It is a draw");
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want to play again?");
        String z=stdin.readLine();
        if(z.equalsIgnoreCase("yes"))
        main();
        else
        System.out.println("Thank you for playing");
        stdin.close();
    }
}
