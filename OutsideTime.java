
/**
 * Write a description of class OutsideTime here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class OutsideTime extends Desire implements Cloneable
{
    /**
     * Constructor for objects of class OutsideTime
     */
    public OutsideTime(){
        //call no-arg constructor
        super();
    }
    
    /**
     * OutsideTime Constructor
     *
     * @param fraction A parameter
     */
    public OutsideTime(Fraction fraction)
    {
        //call super classes constructor with a fraction parameter
        super(fraction);
    }
    
    /**
     * OutsideTime Constructor
     *
     * @param OutsideTime A parameter
     */
    public OutsideTime(OutsideTime OutsideTime)
    {
        
    }

    // /**
     // * OutsideTime Constructor
     // *
     // * @param object A parameter
     // */
    // public boolean equals (Fraction object){
        
    // }

    /**
     * Method CalculateSatisfaction
     *
     * @param other A parameter
     */
    public double CalculateSatisfaction(Desire other){
        //return a double
        return (double)1;
    }
    
    /**
     * Method toString
     *
     * @return The return value
     */
    public String toString(){
        //return "Spending Some Time Outside"
        return "Spending Some Time Outside";
    }
    
    /**
     * Method clone
     *
     * @return The return value
     */
    public OutsideTime clone(){
        //try
        try{
            //return clone
            return (OutsideTime)super.clone();            
        }
        //catch exeception
        catch(Exception e){
            //throw run time exception
            throw new WhatShouldWeDoTonightException();
        }
    }
}
