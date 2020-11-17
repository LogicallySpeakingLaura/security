package defensive_copying;

/**
 * Class to demonstrate how to construct a deep copy of a mutable object. With this, the external references/objects
 * of both the original and copy are hidden and immutable to each other.
 * Copyright: Oracle
 * https://www.oracle.com/java/technologies/javase/seccodeguide.html#6
 *
 * @author LogicallySpeakingLaura
 * @version 2020.10.16
 */
public class DeepCopy
{

    //Attributes
    private String str;


    //Constructors
    public DeepCopy() {}

    public DeepCopy( String str )
    {
        this.str = str;
    }

    /**
     * This constructor is the copy constructor. As it recursively and independently calls the getter for itself,
     * it's attribute is immutable.
     * @param dp - mutable object
     */
    public DeepCopy( DeepCopy dp )
    {
        this( dp.getStr() );

        /*
         * To use a copy constructor:
         * DeepCopy dp = new DeepCopy( "I'm a String" ); first instantiate the object to be copied
         * DeepCopy copyOfDP = new DeepCopy(dp); !!!the deep copy occurs here!!!
         */
    }


    //Setters & getters
    public String getStr()
    {
        return str;
    }

    public void setStr( String str )
    {
        this.str = str;
    }

}