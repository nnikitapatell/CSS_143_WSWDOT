
/**
 * Write a description of class Fraction here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class Fraction {
    //instance variables
    private int numerator;
    private int denominator;

    //default "no-arg" constructor
    /**
     * Fraction Constructor
     *
     */
    Fraction(){
    }

    /**
     * Fraction Constructor
     *
     */
    Fraction(Fraction other){
        this.numerator = other.numerator;
        this.denominator = other.numerator;
    }
    
    //constructor that initializes the data
    /**
     * Fraction Constructor
     * 
     * @param theNumeratorVariable A parameter
     * @param theDenominatorVariable A parameter
     */
    //if the fractions ends up to be a negative that put the negative in the numerator
    Fraction(int theNumeratorVariable, int theDenominatorVariable){
        this.numerator = (theDenominatorVariable < 0 ? -theNumeratorVariable : theNumeratorVariable);
        if (theDenominatorVariable == 0){
            this.denominator = 1;
        }
        this.denominator = (theDenominatorVariable < 0 ? -theDenominatorVariable : theDenominatorVariable);
        //call the reduceFraction method
        reduceFraction();
    }

    //compares "this" to "other"
    /**
     * Method equals
     *
     * @param other A parameter
     * @return The return value
     */
    public boolean equals(Object other){
        //if other is null
        if (other == null){
            //return false
            return false;
        }
        //if other an instance of Fraction class is false
        if (!(other instanceof Fraction)){
            //return false
            return false;
        }
        //that is set to other
        Fraction that = (Fraction) other;

        double thisFraction = (double)this.numerator / this.denominator;
        double thatFraction = (double)that.numerator / that.denominator;
        //returns true if the numerators and the denominators are the same
        return thisFraction == thatFraction;
    }

    /**
     * Method getNumerator
     *
     * @return The return value
     */
    public int getNumerator(){
        //return this.numerator
        return this.numerator;
    }

    /**
     * Method getDenominator
     *
     * @return The return value
     */
    public int getDenominator(){
        //return this.denominator
        return this.denominator;
    }

    /**
     * Method setNumerator
     *
     * @param theNumeratorVariable A parameter
     */
    public void setNumerator(int theNumeratorVariable){
        //this.numerator is set to theNumeratorVariable
        this.numerator = theNumeratorVariable;
        //call the reduceFraction method
        reduceFraction();
    }

    /**
     * Method setDenominator (no zeros allowed)
     *
     * @param theDenominatorVariable A parameter
     */
    public void setDenominator(int theDenominatorVariable){
        // denominarot is set to theDenominatorVariable if it is greater than 0
        if (theDenominatorVariable > 0){
            this.denominator = theDenominatorVariable;
            reduceFraction();
        }
        //if denominator is negative change the numerator
        else if(theDenominatorVariable < 0){
            this.numerator = -this.numerator;
            this.denominator = -theDenominatorVariable;
            //call the reduceFraction method
            reduceFraction();
        }
    }

    /**
     * Method toString
     *
     * @return The return value
     */
    public String toString()
    {
        //returns this.numerator / this.denominator
        return this.numerator + "/" + this.denominator;
    }

    public void setFraction(int num, int denom){
        if(denom != 0){
            this.numerator = num;
            this.denominator = denom;
        }
    }
        
    /**
     * Method reduceFraction will find the greatest common denominator 
     * and divide it to make the fraction in its lowest 
     *
     */
    public void reduceFraction(){
        //integer varirables n, d, largest, and greatestCommonDenominator
        int n = this.numerator;
        int d = this.denominator;
        int largest;
        int greatestCommonDenominator = 0;
        
        //if the numerator is less than 0
        if (this.numerator < 0){
            //n is set to negative numerator
            n = -this.numerator;
        }
        //if n is greater than d
        if (n > d){
            //largest is set to n
            largest = n;
        }
        //else
        else{
            //largest is set to d
            largest = d;
        }

        //find the largest number that divides the numerator and denominator equally
        for (int i = largest; i >= 2; i--){
            if (this.numerator % i == 0 && this.denominator % i == 0){
                greatestCommonDenominator = i;
                break;
            }
        }
        //the greatestCommonDenominator is not 0
        if (greatestCommonDenominator != 0){
            //divide by the greatestCommonDenominator
            this.numerator /= greatestCommonDenominator;
            this.denominator /= greatestCommonDenominator;
        }
    }
}
