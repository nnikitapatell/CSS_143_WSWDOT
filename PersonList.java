import java.util.*;
import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class PersonList here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class PersonList
{
    // holds a List of persons
    public List<Person> myPersonList;

    /**
     * PersonList Constructor
     *
     */
    public PersonList()
    {
        //initialize myPersonList
        this.myPersonList = new List<Person>();
    }

    /**
     * Method LoadPeopleListFromFile
     *
     * @param filename A parameter
     * @param myPersonList A parameter
     */
    public void LoadPeopleListFromFile(String filename, PersonList myPersonList)
    {
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(new FileInputStream(filename));
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        String s = "";
        Person currentPerson = null;
        //boolean currentlyWorkingOnAPerson = false;
        while (fileReader.hasNext())
        {
            s  = fileReader.nextLine();
            String[] tokens = s.split(" "); 

            //t must start with "Name:" then a space, then someone's name (with no spaces in the name).
            if(tokens[0].equals("Name:"))
            {
                // If we get here it means we were in the middle
                // of working on the desires for a Person,
                // but now are done (because we just read another "Name:")
                // and we're about to start on a new Person.
                // So, we need to add the person we were working on
                //  to the PersonList:
                // Now start on a new Person:
                String personsName = tokens[1];
                if(currentPerson != null)
                {
                    this.myPersonList.append(currentPerson);
                }

                currentPerson = new Person(personsName);                
                //currentlyWorkingOnAPerson = true;

            }
            else { // it must be a desire...
                // parse the desire and add it to the Person:
                String desireName = tokens[0];
                String descriptor = tokens[1].replace("\"", ""); // strip out the ""
                String fractionString = tokens[2];
                // parse the fractionString, and make a fraction:
                String[] fractionTokens = fractionString.split("/");
                int numerator = Integer.parseInt(fractionTokens[0]);
                int denominator = Integer.parseInt(fractionTokens[1]);
                Fraction desireStrength = new Fraction(numerator, denominator); // or, if your Fraction
                // only has constructors for
                // ints, then convert these
                // Strings to ints first.
                Desire currentDesire = createDesire(desireName, descriptor, desireStrength);
                if(currentPerson != null)
                {
                    currentPerson.desireList.append(currentDesire);
                }
            }
        }

        //check if currentPerson is null
        if(currentPerson != null)
        {
            //append currentPerson
            this.myPersonList.append(currentPerson);
        }
    }// end of the filereader.hasNext() while loop
    
    // We get here when we run out of text in the file,
    // so we need to load up the last person there was.
    // Unless of course, for some reason there were no people to add...
    // if (!currentlyWorkingOnAPerson){ 
    // System.out.println("ERROR! There were no people in the file [" + filename +"]!");
    // return false;
    // }
    // else {
    // myPersonList.append(currentPerson);
    // return true;

    // }

    /**
     * createDesire
     * ------------
     * Given a string listing the correct Desire class and a descriptor and a desireStrength,
     * this method creates the appropriate Desire object and returns it.
     * PRE: desireName must match the name of one of the desires.
     *      desireStrength should not be negative (nor have a zero denominator)
     * POST: creates and returns the appropriate Desire.
     * @param desireName -- a String, the name of the appropiate Desire class.
     * @param descriptor -- a String, the descriptor (if any) for this class.
     * @param desireStrength -- a Fraction object representing how strong the desire is.
     * @return Desire -- the Desire object created.
     */ 
    public Desire createDesire(String desireName, String descriptor, Fraction desireStrength){
        if (desireName.equals("Eating")) 
        {
            return new Eating(desireStrength); // no descriptor needed
        }
        else if (desireName.equals("MeatAndDairy")) 
        {
            return new MeatAndDairy(desireStrength, descriptor);
        }
        else if (desireName.equals("CarbsAndGrains"))
        {
            return new CarbsAndGrains(desireStrength,descriptor);
        }
        else if(desireName.equals("FruitsAndVeggies"))
        {
            return new FruitsAndVeggies(desireStrength, descriptor);
        }
        else if(desireName.equals("Sweets"))
        {
            return new Sweets(desireStrength, descriptor);
        }
        else if(desireName.equals("HikingOrCamping"))
        {
            return new HikingOrCamping(desireStrength, descriptor);
        }
        else if(desireName.equals("Biking"))
        {
            return new Biking(desireStrength, descriptor);
        }        
        else if(desireName.equals("OtherOutside"))
        {
            return new OtherOutside(desireStrength, descriptor);
        }
        else if(desireName.equals("Rock"))
        {
            return new Rock(desireStrength, descriptor);
        }
        else if(desireName.equals("Country"))
        {
            return new Country(desireStrength, descriptor);
        }
        else if(desireName.equals("RandB"))
        {
            return new RandB(desireStrength, descriptor);
        }
        else if(desireName.equals("Electronic"))
        {
            return new Electronic(desireStrength, descriptor);
        }
        else if(desireName.equals("Classical"))
        {
            return new Classical(desireStrength, descriptor);
        }
        else if(desireName.equals("Internet"))
        {
            return new Internet(desireStrength, descriptor);
        }
        else if(desireName.equals("MoviesOrTV"))
        {
            return new MoviesOrTV(desireStrength, descriptor);
        }
        else if(desireName.equals("VideoGames"))
        {
            return new VideoGames(desireStrength, descriptor);
        }
        else if(desireName.equals("Other"))
        {
            return new Other(desireStrength, descriptor);
        }
        else 
        { // if we got here then they gave us a name of a Desire that doesn't exist.
            System.out.println("ERROR in createDesire function");
            throw new WhatShouldWeDoTonightException();
        }
    } // end createDesire()
}
