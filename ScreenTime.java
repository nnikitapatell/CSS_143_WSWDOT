
/**
 * Write a description of class ScreenTime here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class ScreenTime extends Desire implements Cloneable
{
    /**
     * Constructor for objects of class ScreenTime
     */
    public ScreenTime(){
        //call no-arg constructor
        super();
    }
    
    /**
     * ScreenTime Constructor
     *
     * @param fraction A parameter
     */
    public ScreenTime(Fraction fraction)
    {
        //call super classes constructor with a fraction parameter
        super(fraction);
    }
    
    /**
     * ScreenTime Constructor
     *
     * @param ScreenTime A parameter
     */
    public ScreenTime(ScreenTime ScreenTime)
    {
        
    }

    // /**
     // * ScreenTime Constructor
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
        //return "tenScreenTime"
        return "tenScreenTime";
    }
    
    /**
     * Method clone
     *
     * @return The return value
     */
    public ScreenTime clone(){
        //try
        try{
            return (ScreenTime)super.clone();            
        }
        //catch exeception
        catch(Exception e){
            //throw run time exception
            throw new WhatShouldWeDoTonightException();
        }
    }
}
