import java.util.*;
/**
 * Write a description of class Person here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class Person
{
    // instance variables - replace the example below with your own
    public String name;
    // a list of all the person's desires
    public List<Desire> desireList;
    
    /**
     * Person Constructor
     *
     */
    public Person(){
        //this.desireList is set to new List
        this.desireList = new List<Desire>();
    }

    /**
     * Constructor for objects of class Person
    */
    public Person(String theName){
        //this.name is set to theName
        this.name = theName;
    }
        
    public String toString(){
        String returnValue = "";
        returnValue = this.name + "\n" + this.desireList.toString();
        return returnValue;
    }    
}
