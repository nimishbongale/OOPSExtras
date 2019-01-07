package AssignmentJAVA;
/**
 * The superclass 
 * 
 * @author Nimish Bongale 
 * @version 1.0.0
 */
public class ABCmotors
{
    // instance variables 
    String registno,modelno;
    /**
     * Constructor for objects of class ABCmotors
     */
    public ABCmotors(String reg,String mn)
    {
        // initialise instance variables
        this.registno=reg;
        this.modelno=mn;
    }

    /**
     * An example of a method 
     * 
     * @param      modelname 
     * @return     P or D
     */
    public char petrolordiesel()
    {
        if(modelno.charAt(modelno.length()-1)=='P')
        return 'P';
        else if(modelno.charAt(modelno.length()-1)=='D')
        return 'D';
        else
        return '\0';
    }
}

