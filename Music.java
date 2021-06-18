
/**
 * Write a description of class Music here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class Music extends Desire implements Cloneable
{
    /**
     * Constructor for objects of class Music
     */
    public Music(){
        //call no-arg constructor
        super();
    }
    
    /**
     * Music Constructor
     *
     * @param fraction A parameter
     */
    public Music(Fraction fraction)
    {
        //call super classes constructor with a fraction parameter
        super(fraction);
    }
    
    /**
     * Music Constructor
     *
     * @param Music A parameter
     */
    public Music(Music Music)
    {
        
    }

    // /**
     // * Music Constructor
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
        //return "Listening to Some Music"
        return "Listening to Some Music";
    }
    
    /**
     * Method clone
     *
     * @return The return value
     */
    public Music clone(){
        //try
        try{
            //return clone
            return (Music)super.clone();            
        }
        //catch exeception
        catch(Exception e){
            //throw run time exception
            throw new WhatShouldWeDoTonightException();
        }
    }
}
