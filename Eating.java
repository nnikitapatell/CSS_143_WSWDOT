
/**
 * Write a description of class Eating here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class Eating extends Desire implements Cloneable
{
    /**
     * Constructor for objects of class Eating
     */
    public Eating(){
        //call no-arg constructor
        super();
    }
    
    /**
     * Eating Constructor
     *
     * @param fraction A parameter
     */
    public Eating(Fraction fraction)
    {
        //call super classes constructor with a fraction parameter
        super(fraction);
    }
    
    /**
     * Eating Constructor
     *
     * @param eating A parameter
     */
    public Eating(Eating eating)
    {
        
    }

    // /**
     // * Eating Constructor
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
        //return "Eating Something"
        return "Eating Something";
    }
    
    /**
     * Method clone
     *
     * @return The return value
     */
    public Eating clone(){
        //try
        try{
            //return a deep copy 
            return (Eating)super.clone();            
        }
        //catch exeception
        catch(Exception e){
            //throw run time exception
            throw new WhatShouldWeDoTonightException();
        }
    }
}
