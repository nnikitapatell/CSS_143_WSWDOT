import java.util.*;
import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class ArrayList here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class OptionsList
{
    //This will hold an array of Options
    public OptionsList[] optionsList;
    
    /**
     * OptionsList Constructor
     *
     */
    public OptionsList()
    {
        //initialize myPersonList
        optionsList =  new OptionsList[100];
    }
    

    public static void main (String[] args){
        PersonList myFriends= new PersonList("MyFriends.txt");

        OptionsList SaturdayOptions = new OptionsList("PossibleThingsToDoThisSaturdayNight.txt");

        SaturdayOptions.printRankedListOfWhichOptionsWouldMostSatisfy(myFriends);

        System.out.println("*****************************************************************");
        System.out.println("TEST 1: myFriends1.txt with options1.txt.  A normal sort of test.\n" +
            "Everyone wants to play a video game so that should probably come up first.");
        OptionsList o = new OptionsList("options1.txt");
        PersonList pL = new PersonList("myFriends1.txt");
        System.out.println("Here's the people and what they want: \n" + pL);
        System.out.println("And here's a list of the options for what to do, in order of which would provide the most overall satisfaction:");
        o.printRankedListOfWhichOptionsWouldMostSatisfy(pL);

        System.out.println("*****************************************************************");
        System.out.println("TEST 2: myFriends2.txt with options2.txt.  Even though everyone else wants to listen to music,\n" +
            "Frank's desire for Tetris is so strong that it far outweighs anyone else's desires.\n" +
            "So the video game option should come up first.");
        o = new OptionsList("options2.txt");
        pL = new PersonList("myFriends2.txt");
        System.out.println("Here's the people and what they want: \n" + pL);
        System.out.println("And here's a list of the options for what to do, in order of which would provide the most overall satisfaction:");
        o.printRankedListOfWhichOptionsWouldMostSatisfy(pL);

        System.out.println("*****************************************************************");
        System.out.println("TEST 3: myFriends3.txt with options3.txt.  Two people both want to listen to Bach. So Bach should be first,\n" +
            "And it should have 2 points of satisfaction.\n" +
            "Listening to Mozart should be second, then Pink Floyd.");
        o = new OptionsList("options3.txt");
        pL = new PersonList("myFriends3.txt");
        System.out.println("Here's the people and what they want: \n" + pL);
        System.out.println("And here's a list of the options for what to do, in order of which would provide the most overall satisfaction:");
        o.printRankedListOfWhichOptionsWouldMostSatisfy(pL);

        System.out.println("*****************************************************************");
        System.out.println("TEST 4: myFriends4.txt with options4.txt.  Testing the Other class,\n" +
            "Staring at the wall should win. Then sleep. Then Led Zep (with 0 satisfaction points).");
        o = new OptionsList("options4.txt");
        pL = new PersonList("myFriends4.txt");
        System.out.println("Here's the people and what they want: \n" + pL);
        System.out.println("And here's a list of the options for what to do, in order of which would provide the most overall satisfaction:");
        o.printRankedListOfWhichOptionsWouldMostSatisfy(pL);

    }

    /**
     * OptionList Constructor
     * a constructor that takes a filename
     *
     * @param fileName A parameter
     */
    public OptionsList(String fileName)
    {
        //create a personList
        PersonList personList = new PersonList();
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(new FileInputStream(fileName));
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }

        String s = "";
        // this file will have a list of desires that can be used to create a list of Options
        List<Desire> optionsList = new List<Desire>();
        //boolean currentlyWorkingOnAPerson = false;
        while (fileReader.hasNext())
        {
            s  = fileReader.nextLine();
            String[] tokens = s.split(" ");
            Desire d = personList.createDesire(tokens[0],tokens[1], null);
            optionsList.append(d);
        }

        //iterate through the optionList
        for(int i = 0; i < optionsList.size() ; i++)
        {
            //get item of node
            optionsList[i] = optionsList.getNode(i).item;
        }        
    }

    /**
     * Method printRankedListOfWhichOptionsWouldMostSatisfy
     *
     * @param p A parameter
     */
    public void printRankedListOfWhichOptionsWouldMostSatisfy(PersonList p){
        setTheSatisfaction
        ran
        toString();
    }

    /**
     * Method rank
     *
     */
    public void rank() {
        // iterate through the loop
        for(int i = 0; i < optionsList.length -1; i++){
            int min = i;
            // iterate through the loop
            for(int j = i+1; j < optionsList.length; j++){
                //check index j compared to min desire is less than 0
                if(optionsList[j].compareTo(optionsList[min]) < 0){
                    //min is set to j
                    min = j;
                }
            }
            //create temVar set to min desire
            Option tempVar = optionsList[min];
            //set min deire to current desire
            optionsList[min] = optionsList[i];
            //set current desire to tempVar
            optionsList[i] = tempVar;
        }
    }

    /**
     * Method set
     *
     * @param p A parameter
     */
    public void setTheSatisfaction(PersonList p){
        // iterate through the loop
        for(int i = 0; i < optionsList.length; i++){
            Desire theCurrentDesire = optionsList[i].getDesire();
            List<Person>.Node currentPerson = p.optionsList.head;
            // iterate through the while loop node i s not null
            while(currentPerson != null){
                //iterate through the while loop nod is not null
                while(theCurrentDesire != null){
                    //cread obejcct and set tot eh next desire length
                    Desire d = theCurrentDesire.link;
                    //calculate satisfaction
                    optionsList[i].addSatisfaction(theCurrentDesire.CalculateSatistfation(d));
                    //current desire is set tot eh next desire
                    theCurrentDesire = theCurrentDesire.next;
                }
                //currentPerson is set to the next person
                currentPerson = currentPerson.next;
            }
        }
    }

    /**
     * Method toString
     *
     * @return The return value
     */
    public String toString(){
        //string variable
        String result = "";
        //itterate through the forloop
        for(int i = optionsList.length -1; i>=0; i--){
            //print options
            result += optionsList[i] + "/n";
        }
        //return rseults
        return result;
    }
}
