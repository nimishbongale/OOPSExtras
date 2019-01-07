package AssignmentJAVA;
/**
 *Subclass 2
 * 
 * @author Nimish Bongale 
 * @version 1.0.0
 */
public class ASD extends ABCmotors implements Vehicle
{
    // instance variables 
    boolean overcarr;
    boolean sptrstrim;
    boolean sunrf;

    /**
     * Constructor for objects of class ASD
     */
    public ASD(String r,String mno,boolean mg,boolean pw,boolean aku)
    {
        // initialise instance variables
        super(r,mno);
        this.overcarr=mg;
        this.sptrstrim=pw;
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
        System.out.println("Registration Number:-"+registno+"\nModel Number:-"+modelno+"\nManual Gear Transmission:-"+true+"\nPetrol or Diesel:-"+petrolordiesel()+"\nWide Tyres:-"+true+"\nHalon Lights:-"+true+"\nBack Wipers:-"+true+"\nOvercarr:-"+overcarr+"\nsptrstrim:-"+sptrstrim+"\nSunroof:-"+sunrf);        
    }
}

