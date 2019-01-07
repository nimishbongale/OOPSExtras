package AssignmentJAVA;
/**
 *Subclass 3
 * 
 * @author Nimish Bongale 
 * @version 1.0.0
 */
public class ZXC extends ABCmotors implements Vehicle
{
    // instance variables 
    boolean extnbtspace;
    boolean custombdclr;
    boolean sunrf;

    /**
     * Constructor for objects of class ZXC
     */
    public ZXC(String r,String mno,boolean mg,boolean pw,boolean aku)
    {
        // initialise instance variables
        super(r,mno);
        this.extnbtspace=mg;
        this.custombdclr=pw;
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
        System.out.println("Registration Number:-"+registno+"\nModel Number:-"+modelno+"\nManual Gear Transmission:-"+true+"\nPetrol or Diesel:-"+petrolordiesel()+"\nLeather Seat:-"+true+"\nRear View Camera with Parking assist:-"+true+"\nAuto rain wipers:-"+true+"\nExtnbtspace:-"+extnbtspace+"\ncustombdclr:-"+custombdclr+"\nSunroof:-"+sunrf);        
    }
}


