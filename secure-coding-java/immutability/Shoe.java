package immutability;

/**
 * Class to represent a mutable superclass made immutable.
 * Copyright: Oracle
 * https://www.oracle.com/java/technologies/javase/seccodeguide.html#6
 *
 * @author LogicallySpeakingLaura
 * @version 2020.10.10
 */
public final class Shoe
{

    //Attributes
    /*
     * Making all attributes private and final means they cannot be changed once assigned,
     * or by any other class that instantiates this object.
     */
    private final int HEEL_HEIGHT;
    private final int SHAFT_HEIGHT;
    private final boolean HAS_LACES;
    private final boolean HAS_STRAP;


    //Constructors
    /*
     * Constructor to instantiate an object from the class. Set to private so it is not publicly accessible or modifiable.
     */
    private Shoe( int heelHeight, int shaftHeight, boolean hasLaces, boolean hasStrap )
    {
        this.HEEL_HEIGHT = heelHeight;
        this.SHAFT_HEIGHT = shaftHeight;
        this.HAS_LACES = hasLaces;
        this.HAS_STRAP = hasStrap;
    }

    /*
     * Method to return a copy of this class.
     */
    public static Shoe getShoeInstance( int heelHeight, int shaftHeight, boolean hasLaces, boolean hasStrap )
    {
        return new Shoe( heelHeight, shaftHeight, hasLaces, hasStrap );
    }


    //Getters
    /*
     * Only need getters to retrieve attribute values.
     * Do not want setters as they make class mutable, defeating the purpose of the security principle.
     */
    public int getHeelHeight()
    {
        return HEEL_HEIGHT;
    }

    public int getShaftHeight()
    {
        return SHAFT_HEIGHT;
    }

    public boolean isHasLaces()
    {
        return HAS_LACES;
    }

    public boolean isHasStrap()
    {
        return HAS_STRAP;
    }

}