
/**
 * Write a description of class Other here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class Other extends Desire implements Cloneable
{
    // instance variables - replace the example below with your own
    public String descriptor;
   
    /**
     * Constructor for objects of class Other
     */
    public Other()
    {
        //set this.descriptor to ""
        this.descriptor = "";
    }

    /**
     * Other Constructor
     *
     * @param desireStrength A parameter
     */
    public Other(Fraction desireStrength)
    {
        //call cuper with parameter desireStrength
        super(desireStrength);
        this.descriptor = "";
    }

    /**
     * Other Constructor
     *
     * @param desireStrength A parameter
     * @param descriptor A parameter
     */
    public Other(Fraction desireStrength, String descriptor)
    {
        //call super constructor
        super(desireStrength);
        //this.descriptor is set to descriptor
        this.descriptor = descriptor;
    }

    /**
     * Method CalculateSatisfaction
     *
     * @param other A parameter
     * @return The return value
     * @Override
     * 
     */
    public double CalculateSatisfaction(Desire other)
    {
        //similiarity is a double variable
        double similarity;
        if(this.getClass().equals(other.getClass())){
            //if the descriptors are the same
            if(this.descriptor.equals("") && this.descriptor. equals(this.descriptor)){
                similarity = 1.0;
            }
            else{ // if the class are not the same
                similarity = 0.5;
            }
        }else{
            similarity = 0;
        }
        //Calculate Satisfaction 
        double calculatedSatisfaction = Math.round(((similarity * super.getDesireStrengthAsDouble())*100)/100);
        //return calculateSatisfaction
        return calculatedSatisfaction;
    }
    
        public Other clone(){
        //try
        try{
            return (Other)super.clone();            
        }
        //catch exeception
        catch(Exception e){
            //throw run time exception
            throw new WhatShouldWeDoTonightException();
        }
    }
}
