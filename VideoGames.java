
/**
 * Write a description of class VideoGames here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class VideoGames extends ScreenTime
{
    // instance variables 
    public String descriptor;
    //object created
    Internet object = new Internet();

    /**
     * Constructor for objects of class VideoGames
     */
    public VideoGames()
    {
        //descriptor is set empty
        this.descriptor = "";
    }

    /**
     * VideoGames Constructor
     *
     * @param desireStrength A parameter
     */
    public VideoGames(Fraction desireStrength)
    {
        //call super constructor
        super(desireStrength);
        //this.descriptor  is set to  ""
        this.descriptor = "";
    }

    /**
     * VideoGames Constructor
     *
     * @param desireStrength A parameter
     * @param descriptor A parameter
     */
    public VideoGames(Fraction desireStrength, String descriptor)
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
     */
    public double CalculateSatisfaction(Desire other)
    {
        //double similarity is set to 0
        double similarity = 0.0;
        double calculatedSatisfaction = 0.0;
        //check if the class are the same
        if(this.getClass().equals(other.getClass())){
            VideoGames that = (VideoGames) other;
            //if the descriptors are the same
            if(this.descriptor.equals(that.descriptor)){
                similarity = 1.0;
            }else{ //if they belong to the same calss,but the descriptor is not the same
                similarity = .65;
            }
        }else{ // if the class are not the same
            if(this.toString().equals(other.toString())){  //don't have the exact same class, but they have the same parent class
                similarity = .3;
            }else{ //if the objects are not of the superclass
                similarity = 0.0;
            }
        }
        //calculate Satisfaction
        calculatedSatisfaction = Math.round(((similarity * object.getDesireStrengthAsDouble())*100)/100);
        //return calculated Satisfaction
        return calculatedSatisfaction;
    }
}
