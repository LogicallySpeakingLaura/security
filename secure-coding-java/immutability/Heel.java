package immutability;

/**
 * Class to represent a mutable subclass made immutable through composition.
 * Copyright: Oracle
 * https://www.oracle.com/java/technologies/javase/seccodeguide.html#6
 *
 * @author LogicallySpeakingLaura
 * @version 2020.10.10
 */
public final class Heel
{

    //Attributes
    private final Shoe SHOE;
    private final String HEEL_TYPE;
    private final String TOE_SHAPE;


    //Constructors
    private Heel( int heelHeight, int shaftHeight, boolean hasLaces, boolean hasStrap, String heelType, String toeShape )
    {                                                                                    //attributes passed individually to arg
        this.SHOE = Shoe.getShoeInstance( heelHeight, shaftHeight, hasLaces, hasStrap ); //assigned w/ method that calls private constructor
        this.HEEL_TYPE = heelType;
        this.TOE_SHAPE = toeShape;
    }

    public static Heel getHeelInstance( int heelHeight, int shaftHeight, boolean hasLaces, boolean hasStrap, String heelType, String toeShape )
    {
        return new Heel( heelHeight, shaftHeight, hasLaces, hasStrap, heelType, toeShape );
    }

    //Getters constructed as normal, once again no setters...

}
