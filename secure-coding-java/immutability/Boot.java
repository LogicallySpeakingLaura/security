package immutability;

/**
 * Class to represent a mutable subclass made immutable through composition.
 * Copyright: Oracle
 * https://www.oracle.com/java/technologies/javase/seccodeguide.html#6
 *
 * @author LogicallySpeakingLaura
 * @version 2020.10.10
 */
public final class Boot
{

    //Attributes
    private final Shoe SHOE;
    private final boolean HAS_FUR;


    //Constructors
    private Boot( int heelHeight, int shaftHeight, boolean hasLaces, boolean hasStrap, boolean hasFur )
    {                                                                                    //attributes passed individually to arg
        this.SHOE = Shoe.getShoeInstance( heelHeight, shaftHeight, hasLaces, hasStrap ); //assigned w/ method that calls private constructor
        this.HAS_FUR = hasFur;
    }

    public static Boot getBootInstance( int heelHeight, int shaftHeight, boolean hasLaces, boolean hasStrap, boolean hasFur  )
    {
        return new Boot( heelHeight, shaftHeight, hasLaces, hasStrap, hasFur );
    }

    //Getters constructed as normal, once again no setters...

}
