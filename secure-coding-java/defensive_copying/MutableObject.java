package defensive_copying;

/**
 * Class to demonstrate a mutable object, i.e. an object that can have its state and content changed.
 * Copyright: Oracle
 * https://www.oracle.com/java/technologies/javase/seccodeguide.html#6
 *
 * @author LogicallySpeakingLaura
 * @version 2020.10.16
 * @see ShallowCopy for defensive copying application(s)
 */
public class MutableObject
{

    //Attributes
    private String str;


    //Constructors
    public MutableObject() {} //default empty constructor

    public MutableObject( String str )
    {
        this.str = str;
    }


    //Setters & getters
    public String getMutableStr()
    {
        return str;
    }

    //having a setter allows the value to be changed, hence why object is mutable and more insecure
    public void setMutableStr( String str )
    {
        this.str = str;
    }

}