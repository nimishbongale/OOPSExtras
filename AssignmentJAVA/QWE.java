package AssignmentJAVA;
/**
 *Subclass 1
 * 
 * @author Nimish Bongale 
 * @version 1.0.0
 */
public class QWE extends ABCmotors implements Vehicle
{
    // instance variables 
    boolean foglights;
    boolean ABS;
    boolean sunrf;

    /**
     * Constructor for objects of class QWE
     */
    public QWE(String r,String mno,boolean mg,boolean pw,boolean aku)
    {
        // initialise instance variables
        super(r,mno);
        this.foglights=mg;
        this. ABS=pw;
        this.sunrf=aku;
    }

    /**
     * An example of a method
     * 
     * @param  null
     * @return  void 
     */
    public void display()
    {
        System.out.println("*****INFO*****");
        System.out.println("Registration Number:-"+registno+"\nModel Number:-"+modelno+"\nManual Gear Transmission:-"+true+"\nPetrol or Diesel:-"+petrolordiesel()+"\nPower Windows:-"+true+"\nAuto Key Unlock:-"+true+"\nFoglights:-"+foglights+"\nABS:-"+ABS+"\nSunroof:-"+sunrf);        
    }
}

