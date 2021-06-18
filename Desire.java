import java.util.*;
/**
 * Write a description of class Desire here.
 *
 * @author Nikita Patel
 * @version 1
 */
public abstract class Desire extends Fraction implements Comparable<Desire>{
    // instance variables
    protected Fraction desireStrength;

    /**
     * Constructor for objects of class Desire
     */
    public Desire(){
        this.desireStrength = new Fraction(0,1);
    }

    /**
     * Desire Constructor
     *
     * @param fraction A parameter
     */
    public Desire(Fraction fraction)
    {
        this.desireStrength = fraction;
    }

    /**
     * Method getDesireStrength
     *
     * @return The return value
     */
    public Fraction getDesireStrength(){
        return new Fraction(this.desireStrength.getNumerator(), this.desireStrength.getDenominator());
    }

    /**
     * Method getDesireStrengthAsDouble
     *
     * @return The return value
     */
    public double getDesireStrengthAsDouble()
    {
        int num = this.desireStrength.getNumerator();
        int den = this.desireStrength.getDenominator();
        double doub = (double)num / den;
        return doub;
    }

    /**
     * Method setDesireStrength
     *
     * @param newStrength A parameter
     */
    public void setDesireStrength(Fraction newStrength){
        this.desireStrength = newStrength;
    }

    // public Desire(Desire other){
    // this.desireStrength = new Fraction(other.desireStrength);
    // }

    /**
     * Method compareTo
     *
     * @param other A parameter
     * @return The return value
     */
    public int compareTo(Desire other){
        return (desireStrength.getNumerator() * other.desireStrength.getDenominator())-(other.desireStrength.getNumerator() * desireStrength.getDenominator());
    }

    /**
     * Method CalculateSatisfaction
     *
     * @param other A parameter
     * @return The return value
     */
    public abstract double CalculateSatisfaction(Desire other);

    /**
     * Method clone
     *
     * @return The return value
     */
    @Override 
    public Desire clone() 
    {
        // clone object set to null
        Desire clone = null;
        //try catch used to catch exceptions
        try
        {
            //clone is set to supers clone method
            clone = (Desire) super.clone();
            //setDesireStrength
            clone.setDesireStrength(new Fraction(clone.getDesireStrength()));
        }
        //catch clone exception
        catch (CloneNotSupportedException e)
        {
            //print exception message
            System.out.println(e.toString());
        }
        //return clone
        return clone;
    }
}
